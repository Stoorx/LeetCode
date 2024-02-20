package one.stoorx.leetcode.algorithms;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int right = 0;
        int left = 0;
        for (; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                right = i;
                break;
            }
        }
        for (; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                left = i + 1;
                break;
            }
        }
        return right - left + 1;
    }
}
