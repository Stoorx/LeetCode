package one.stoorx.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {
    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void longestCommonPrefix() {
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(
                new String[]{"flower", "flow", "flight"}
        ));
        assertEquals("", longestCommonPrefix.longestCommonPrefix(
                new String[]{"dog", "racecar", "car"}
        ));
    }
}