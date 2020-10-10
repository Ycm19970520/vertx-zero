package io.vertx.up.uca.jooq.cache;

import io.github.jklingsporn.vertx.jooq.future.VertxDAO;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.plugin.cache.hit.CMessage;
import io.vertx.tp.plugin.cache.hit.CMessageKey;
import io.vertx.tp.plugin.cache.hit.CMessageList;
import io.vertx.tp.plugin.cache.hit.CMessageUnique;
import io.vertx.up.log.Annal;
import io.vertx.up.uca.jooq.JqAnalyzer;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
@SuppressWarnings("all")
abstract class AbstractAside {
    /*
     * L1 Aside executing for cache
     */
    protected transient L1Aside executor;
    protected transient JqAnalyzer analyzer;

    protected void initialize(final Class<?> clazz, final VertxDAO vertxDAO) {
        final JqAnalyzer analyzer = JqAnalyzer.create(vertxDAO);
        this.analyzer = analyzer;
        this.executor = new L1Aside(analyzer);
    }

    /*
     * Logger that will be used in L1 cache sub-classes
     */
    protected Annal logger() {
        return Annal.get(this.getClass());
    }

    // ------------------ Sub-class Method -------------------------
    protected <T> T argument(final Integer index, final ProceedingJoinPoint point) {
        final Object[] args = point.getArgs();
        if (index < args.length) {
            return (T) args[index];
        } else {
            return null;
        }
    }

    /*
     * Major split code logical for duplicated
     */
    protected CMessage messageField(final ProceedingJoinPoint point) {
        final String field = this.argument(0, point);
        final Object value = this.argument(1, point);
        return this.message(field, value);
    }

    protected CMessage messageUnique(final ProceedingJoinPoint point) {
        final JsonObject condition = this.argument(0, point);
        return this.message(condition);
    }

    protected CMessage messagesField(final ProceedingJoinPoint point) {
        final String field = this.argument(0, point);
        final Object value = this.argument(1, point);
        return this.messages(field, value);
    }

    protected CMessage messageList(final ProceedingJoinPoint point) {
        final JsonObject condition = this.argument(0, point);
        return this.messages(condition);
    }

    /*
     * CMessage creation for sub-class usage
     */
    protected CMessage message(final Object id) {
        final CMessage message = new CMessageKey(id, this.analyzer.type());
        message.bind(this.analyzer.primarySet());
        return message;
    }

    protected CMessage message(final String field, final Object value) {
        final CMessage message = new CMessageUnique(field, value, this.analyzer.type());
        message.bind(this.analyzer.primarySet());
        return message;
    }

    protected CMessage messages(final String field, final Object value) {
        final CMessage message = new CMessageList(field, value, this.analyzer.type());
        message.bind(this.analyzer.primarySet());
        return message;
    }

    protected CMessage message(final JsonObject condition) {
        final CMessage message = new CMessageUnique(condition, this.analyzer.type());
        message.bind(this.analyzer.primarySet());
        return message;
    }

    protected CMessage messages(final JsonObject condition) {
        final CMessage message = new CMessageList(condition, this.analyzer.type());
        message.bind(this.analyzer.primarySet());
        return message;
    }
}
