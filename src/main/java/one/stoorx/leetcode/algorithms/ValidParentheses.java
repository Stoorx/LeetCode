package one.stoorx.leetcode.algorithms;

import java.util.ArrayDeque;
import java.util.Objects;

public class ValidParentheses {
    public boolean isValid(String s) {
        var stack = new ArrayDeque<Character>();
        try {
            for (var c : s.toCharArray()) {
                switch (c) {
                    case '(', '[', '{' -> stack.offerLast(c);
                    case ')' -> {
                        if (Objects.requireNonNull(stack.peekLast()) == '(') {
                            stack.removeLast();
                        } else return false;
                    }
                    case ']' -> {
                        if (Objects.requireNonNull(stack.peekLast()) == '[') {
                            stack.removeLast();
                        } else return false;
                    }
                    case '}' -> {
                        if (Objects.requireNonNull(stack.peekLast()) == '{') {
                            stack.removeLast();
                        } else return false;
                    }
                    default -> {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        } catch (NullPointerException e) {
            return false;
        }
    }
}
