package one.stoorx.leetcode.algorithms;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        try {
            loop:
            for (int i = 0; ; i++) {
                char currentChar = strs[0].charAt(i);
                for (String str : strs) {
                    if (str.charAt(i) != currentChar)
                        break loop;
                }
                sb.append(currentChar);
            }
        } catch (IndexOutOfBoundsException ignore) {
        }
        return sb.toString();
    }
}
