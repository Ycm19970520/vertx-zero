package io.aeon.runtime;

import io.horizon.annotations.Memory;
import io.horizon.uca.cache.Cc;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

/**
 * 「运行时应用集数据缓存」
 * 氘(dāo)（重氢） - 2H（稀有能源元素）
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
interface CH2H extends CH1H {
    /*
     * 「验证规则集」
     * 原 ZeroCodex 部分代码
     */
    @Memory(JsonObject.class)
    Cc<String, JsonObject> CC_CODEX = Cc.open();

    /*
     * 「应用配置集」
     * 用于存储 XApp + XSource 等应用程序配置集
     */
    @Memory(JsonObject.class)
    Cc<String, JsonObject> CC_META_APP = Cc.open();

    /*
     * 「应用模块集」
     * 用于存储 BBag + BBlock 等应用模块配置集
     */
    @Memory(Future.class)
    Cc<String, Future<JsonArray>> CCA_META_ENTRY = Cc.openA();
    @Memory(Future.class)
    Cc<String, Future<JsonObject>> CCA_DATA_MODULE = Cc.openA();
}
