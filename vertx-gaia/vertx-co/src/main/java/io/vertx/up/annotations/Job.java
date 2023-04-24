package io.vertx.up.annotations;

import io.vertx.up.eon.bridge.Strings;
import io.horizon.eon.em.scheduler.JobType;

import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;

/**
 * Annotate the job tasks that will be scanned by zero and started by ZeroScheduler
 * Job category:
 * 1. FIXED：The tasks are made by zero and managed by timer, it execute at fixed timestamp.
 * 2. SCHEDULED: The tasks are made by zero and managed by scheduler, it execute in loop per time unit from started.
 * 3. ONCE: The task could be triggered by another job or manually and it's ran once but it's stored in JobStore.
 * In annotation, it's only ok when type = SCHEDULED
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Job {
    /**
     * Required for job to describe job type here.
     */
    JobType value();

    /**
     * Default job name will be generated by zero framework.
     */
    String name() default Strings.EMPTY;

    /**
     * Job configuration data stored path, when you define complex job, it's required to modify job definition.
     */
    String config() default Strings.EMPTY;

    /**
     * Duration value of current job
     * 30 s
     */
    long duration() default 300;

    /**
     * Threshold value of current job
     * 900 s
     */
    int threshold() default 900;

    /**
     * Duration unit ( time unit ) for current job
     */
    TimeUnit durationUnit() default TimeUnit.SECONDS;

    /**
     * Threshold unit ( time unit ) for current job
     */
    TimeUnit thresholdUnit() default TimeUnit.SECONDS;

    /**
     * Smart timestamp for per mode
     * 1. D,00:00,... per day
     * 2. W,00:00/3,... per week
     * 3. M,00:00/4,... per month
     * 4. Q,00:00/33,... per qt
     * 5. Y,00:00/2-22,.. per year
     */
    String formula() default Strings.EMPTY;
}
