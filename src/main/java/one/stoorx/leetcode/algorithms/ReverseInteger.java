package one.stoorx.leetcode.algorithms;

public class ReverseInteger {
    public int reverse(int x) {
        if (x == 0) return 0;
        try {
            return doReverse(x);
        } catch (ArithmeticException ignore) {
            return 0;
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
