package io.vertx.up.exception.web;

import io.horizon.eon.em.secure.ScDim;
import io.horizon.eon.em.web.HttpStatusCode;
import io.horizon.exception.WebException;

public class _409DmComponentException extends WebException {
    public _409DmComponentException(final Class<?> clazz, final ScDim dim) {
        super(clazz, dim.name());
    }

    @Override
    public HttpStatusCode getStatus() {
        return HttpStatusCode.CONFLICT;
    }

    @Override
    public int getCode() {
        return -60058;
    }
}
