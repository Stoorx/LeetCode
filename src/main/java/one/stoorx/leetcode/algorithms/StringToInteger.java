package one.stoorx.leetcode.algorithms;

public class StringToInteger {
    public int myAtoi(String s) {
        int currentIndex = 0;
        int result = 0;
        int sign = 1;

        while (currentIndex < s.length() && s.charAt(currentIndex) == ' ')
            currentIndex++;

        if (currentIndex < s.length()) {
            switch (s.charAt(currentIndex)) {
                case '+' -> currentIndex++;
                case '-' -> {
                    sign = -1;
                    currentIndex++;
                }
            }
        }

        loop:
        try {
            while (currentIndex < s.length()) {
                switch (s.charAt(currentIndex)) {
                    case '0' -> result = Math.addExact(Math.multiplyExact(result, 10), 0);
                    case '1' -> result = Math.addExact(Math.multiplyExact(result, 10), 1);
                    case '2' -> result = Math.addExact(Math.multiplyExact(result, 10), 2);
                    case '3' -> result = Math.addExact(Math.multiplyExact(result, 10), 3);
                    case '4' -> result = Math.addExact(Math.multiplyExact(result, 10), 4);
                    case '5' -> result = Math.addExact(Math.multiplyExact(result, 10), 5);
                    case '6' -> result = Math.addExact(Math.multiplyExact(result, 10), 6);
                    case '7' -> result = Math.addExact(Math.multiplyExact(result, 10), 7);
                    case '8' -> result = Math.addExact(Math.multiplyExact(result, 10), 8);
                    case '9' -> result = Math.addExact(Math.multiplyExact(result, 10), 9);
                    default -> {
                        break loop;
                    }
                }
                currentIndex++;
            }
        } catch (ArithmeticException ignore) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return result * sign;
    }
}
