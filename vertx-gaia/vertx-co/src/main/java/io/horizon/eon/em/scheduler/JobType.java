package io.horizon.eon.em.scheduler;

public enum JobType {
    ONCE,       // 「Development」Run once
    FIXED,      // runAt,    Run at timestamp based on simple configuration.
    FORMULA,    // runExpr,  Run Formula  ( Support Multi )
}