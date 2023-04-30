package io.horizon.exception.internal;

import io.horizon.annotations.HDevelop;
import io.horizon.eon.error.ErrorCode;
import io.horizon.exception.InternalException;
import io.horizon.util.HaS;

public class JsonFormatException extends InternalException {
    public JsonFormatException(final Class<?> caller, final String filename) {
        super(caller, HaS.fromMessage(ErrorCode._11004.M(), filename));
    }

    @Override
    protected int getCode() {
        return ErrorCode._11004.V();
    }

    @HDevelop("IDE视图专用")
    private int __11004() {
        return this.getCode();
    }
}
