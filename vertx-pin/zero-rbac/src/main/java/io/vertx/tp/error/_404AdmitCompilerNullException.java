package io.vertx.tp.error;

import io.horizon.eon.em.secure.ScIn;
import io.horizon.eon.em.web.HttpStatusCode;
import io.horizon.exception.WebException;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class _404AdmitCompilerNullException extends WebException {
    public _404AdmitCompilerNullException(final Class<?> clazz, final ScIn in) {
        super(clazz, in.name());
    }

    @Override
    public int getCode() {
        return -80225;
    }

    @Override
    public HttpStatusCode getStatus() {
        return HttpStatusCode.NOT_FOUND;
    }
}
