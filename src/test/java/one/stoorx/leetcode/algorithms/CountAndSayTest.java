package one.stoorx.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountAndSayTest {
    private final CountAndSay countAndSay = new CountAndSay();

    @Test
    void countAndSay() {
        assertEquals("1", countAndSay.countAndSay(1));
        assertEquals("1211", countAndSay.countAndSay(4));
        assertEquals("111221", countAndSay.countAndSay(5));
    }
}