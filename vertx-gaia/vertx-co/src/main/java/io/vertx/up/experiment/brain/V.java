package io.vertx.up.experiment.brain;

import io.vertx.up.uca.cache.CcOld;

@SuppressWarnings("all")
public class V {

    private static final CcOld<String, Vto> CC_VTO = CcOld.open();

    public static Vto vInstant() {
        return CC_VTO.fiber(InstantVto::new, InstantVto.class);
        // Fn.po?lThread(POOL_VTO, InstantVto::new, InstantVto.class.getName());
        // return Ut.singleton(InstantVto.class);
    }

    public static Vto vInteger() {
        return CC_VTO.fiber(IntVto::new, IntVto.class);
        // Fn.po?lThread(POOL_VTO, IntVto::new, IntVto.class.getName());
        // return Ut.singleton(IntVto.class);
    }

    public static Vto vLong() {
        return CC_VTO.fiber(LongVto::new, LongVto.class);
        // Fn.po?lThread(POOL_VTO, LongVto::new, LongVto.class.getName());
        // return Ut.singleton(LongVto.class);
    }

    public static Vto vShort() {
        return CC_VTO.fiber(ShortVto::new, ShortVto.class);
        // Fn.po?lThread(POOL_VTO, ShortVto::new, ShortVto.class.getName());
        // return Ut.singleton(ShortVto.class);
    }

    public static Vto vDouble() {
        return CC_VTO.fiber(DoubleVto::new, DoubleVto.class);
        // Fn.po?lThread(POOL_VTO, DoubleVto::new, DoubleVto.class.getName());
        // return Ut.singleton(DoubleVto.class);
    }

    public static Vto vFloat() {
        return CC_VTO.fiber(FloatVto::new, FloatVto.class);
        // Fn.po?lThread(POOL_VTO, FloatVto::new, FloatVto.class.getName());
        // return Ut.singleton(FloatVto.class);
    }

    public static Vto vBoolean() {
        return CC_VTO.fiber(BooleanVto::new, BooleanVto.class);
        // Fn.po?lThread(POOL_VTO, BooleanVto::new, BooleanVto.class.getName());
        // return Ut.singleton(BooleanVto.class);
    }

    public static Vto vDate() {
        return CC_VTO.fiber(DateVto::new, DateVto.class);
        // Fn.po?lThread(POOL_VTO, DateVto::new, DateVto.class.getName());
        // return Ut.singleton(DateVto.class);
    }
}
