package cn.vertxup.fm.api;

import cn.vertxup.fm.domain.tables.daos.*;
import cn.vertxup.fm.domain.tables.pojos.FDebt;
import cn.vertxup.fm.domain.tables.pojos.FPaymentItem;
import cn.vertxup.fm.service.business.AccountStub;
import cn.vertxup.fm.service.business.FillStub;
import cn.vertxup.fm.service.business.IndentStub;
import com.google.inject.Inject;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.fm.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Me;
import io.vertx.up.annotations.Queue;
import io.vertx.up.atom.Refer;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;

import java.util.List;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@Queue
public class SettleActor {

    @Inject
    private transient IndentStub indentStub;

    @Inject
    private transient AccountStub accountStub;

    @Inject
    private transient FillStub fillStub;

    @Me
    @Address(Addr.Settle.UP_PAYMENT)
    public Future<JsonObject> upPayment(final boolean isRunUp,      // S Bill
                                        final JsonObject data) {
        final Refer settle = new Refer();
        return this.indentStub.settleAsync(data)
            .compose(Ux.Jooq.on(FSettlementDao.class)::insertAsync)
            .compose(settle::future)
            .compose(inserted -> this.indentStub.settleAsync(data.getJsonArray(KName.ITEMS), data))
            .compose(items -> {
                // Items Processing
                this.fillStub.settle(settle.get(), items);
                return Ux.Jooq.on(FBillItemDao.class).updateAsync(items)
                    .compose(this.accountStub::inBook)
                    .compose(nil -> Ux.future(items));
            })
            .compose(items -> this.indentStub.settleAsync(settle.get(), items))
            .compose(Ux.Jooq.on(FSettlementItemDao.class)::insertAsync)
            .compose(settleItems -> {
                if (isRunUp) {
                    // DEBT Processing
                    final FDebt debt = Ux.fromJson(data, FDebt.class);
                    this.fillStub.settle(settle.get(), debt);
                    return Ux.Jooq.on(FDebtDao.class).insertAsync(debt).compose(insertd -> {
                        settleItems.forEach(each -> each.setDebtId(insertd.getKey()));
                        return Ux.Jooq.on(FSettlementItemDao.class).updateAsync(settleItems)
                            .compose(nil -> Ux.futureT());
                    });
                } else {
                    // Payment Processing
                    final List<FPaymentItem> payments = Ux.fromJson(data.getJsonArray("payment"), FPaymentItem.class);
                    this.fillStub.payment(settle.get(), payments);
                    return Ux.Jooq.on(FPaymentItemDao.class).insertAsync(payments)
                        .compose(nil -> Ux.futureT());
                }
            })
            .compose(nil -> Ux.future(settle.get()))
            .compose(Ux::futureJ);
    }
}