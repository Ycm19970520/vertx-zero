package io.vertx.tp.workflow.uca.component;

import cn.vertxup.workflow.domain.tables.pojos.WTodo;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.workflow.atom.ConfigTodo;
import io.vertx.up.unity.Ux;
import org.camunda.bpm.engine.runtime.ProcessInstance;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class TransferSave extends AbstractTodo {
    @Override
    public Future<WTodo> moveAsync(final JsonObject params, final ProcessInstance instance) {
        // Todo Updating
        return this.updateAsync(params).compose(todo -> {
            final ConfigTodo configTodo = new ConfigTodo(todo);
            return this.updateAsync(params, configTodo)
                .compose(nil -> Ux.future(todo));
        });
    }
}
