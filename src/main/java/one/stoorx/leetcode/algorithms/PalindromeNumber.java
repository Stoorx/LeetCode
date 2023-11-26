package one.stoorx.leetcode.algorithms;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x == 0)
            return true;
        try {
            return doReverse(x) == x;
        } catch (ArithmeticException ignore) {
            return false;
        }
    }

    private int doReverse(int x) {
        int result = 0;
        for (int lastDigit = x % 10; x != 0; x /= 10, lastDigit = x % 10) {
            result = Math.addExact(Math.multiplyExact(result, 10), lastDigit);
        }
        return result;
    }
}
