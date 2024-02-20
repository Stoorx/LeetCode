package one.stoorx.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthOfLastWordTest {
    private final LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

    @Test
    void lengthOfLastWord() {
        assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World"));
        assertEquals(4, lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, lengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));
        assertEquals(1, lengthOfLastWord.lengthOfLastWord(" a"));
    }
}