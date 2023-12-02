package one.stoorx.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToIntegerTest {
    private final StringToInteger stringToInteger = new StringToInteger();

    @Test
    void myAtoi() {
        assertEquals(42, stringToInteger.myAtoi("42"));
        assertEquals(-42, stringToInteger.myAtoi("   -42"));
        assertEquals(4193, stringToInteger.myAtoi("4193 with words"));
        assertEquals(-2147483648, stringToInteger.myAtoi("-91283472332"));
    }
}