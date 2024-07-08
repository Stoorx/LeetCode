package one.stoorx.leetcode.algorithms;

import java.util.HashSet;
import java.util.Set;

// Task: 3. Longest Substring Without Repeating Characters
// Link: https://leetcode.com/problems/longest-substring-without-repeating-characters
// Level: Medium
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        Set<Character> letters = new HashSet<>();
        for (int beginIndex = 0, endIndex = 0; endIndex < s.length(); ++endIndex) {
            char currentChar = s.charAt(endIndex);
            if (letters.contains(currentChar)) {
                result = Math.max(result, letters.size());
                while (letters.contains(currentChar)) {
                    letters.remove(s.charAt(beginIndex++));
                }
            }
            letters.add(currentChar);
        }
        return Math.max(result, letters.size());
    }
}
