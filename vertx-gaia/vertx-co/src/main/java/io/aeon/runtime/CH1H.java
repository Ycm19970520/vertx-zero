package io.aeon.runtime;

import io.aeon.atom.iras.HAeon;
import io.aeon.atom.iras.HBoot;
import io.horizon.annotations.Memory;
import io.horizon.runtime.cache.CStore;
import io.horizon.specification.action.HEvent;
import io.horizon.uca.cache.Cc;

/**
 * 「运行时组件缓存」
 * 氕(piē) - 1H（普通能源元素）
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
interface CH1H extends CStore {
    /*
     * CC_AEON:  Aeon系统启动后的核心配置缓存
     * CC_BOOT:  Aeon系统启动过后的所有使用类清单（组件接口集）
     */
    @Memory(HAeon.class)
    Cc<Integer, HAeon> CC_AEON = Cc.open();
    @Memory(HBoot.class)
    Cc<Integer, HBoot> CC_BOOT = Cc.open();


    /*
     * 「线程级」
     * CCT_EVENT: Aeon中的所有Event集合
     */
    @SuppressWarnings("all")
    @Memory(HEvent.class)
    Cc<String, HEvent> CCT_EVENT = Cc.openThread();


    /*
     * 「Zero标准」
     * CC_SPI:    内置调用HService形成的通道接口（ServiceLoader规范）
     *            HService优先级
     *            - /META-INF/services/aeon/        Aeon Enabled
     *            - /META-INF/services/             Zero Extension Enabled
     */
    @Memory(Object.class)
    Cc<Class<?>, Object> CC_SPI = Cc.open();
}
