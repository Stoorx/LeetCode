package one.stoorx.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShuffleStringTest {
    private final ShuffleString shuffleString = new ShuffleString();

    @Test
    void restoreString() {
        assertEquals("leetcode", shuffleString.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
        assertEquals("abc", shuffleString.restoreString("abc", new int[]{0, 1, 2}));
    }
}