package io.horizon.util;

import io.horizon.eon.VString;

import java.util.Objects;

/**
 * @author lang : 2023/4/27
 */
final class HNumeric {
    private HNumeric() {
    }

    static boolean isPositive(final String literal) {
        return Objects.nonNull(literal)
            && HIs.isMatch(literal, VString.REGEX.POSITIVE);
    }

    static boolean isPositive(final int number) {
        return 0 < number;
    }

    static boolean isNegative(final String literal) {
        return Objects.nonNull(literal)
            && HIs.isMatch(literal, VString.REGEX.NEGATIVE);
    }

    static boolean isNegative(final int number) {
        return 0 > number;
    }

    static boolean isInteger(final String literal) {
        return (Objects.nonNull(literal)
            && HIs.isMatch(literal, VString.REGEX.INTEGER))
            || isPositive(literal)
            || isNegative(literal);
    }

    static boolean isDecimal(final String literal) {
        return Objects.nonNull(literal)
            && HIs.isMatch(literal, VString.REGEX.DECIMAL);
    }

    static boolean isReal(final String literal) {
        return isInteger(literal) || isDecimal(literal);
    }

    static boolean isDecimalPositive(final String literal) {
        return Objects.nonNull(literal)
            && HIs.isMatch(literal, VString.REGEX.DECIMAL_POSITIVE);
    }

    static boolean isDecimalNegative(final String literal) {
        return Objects.nonNull(literal)
            && HIs.isMatch(literal, VString.REGEX.DECIMAL_NEGATIVE);
    }
}
