package one.stoorx.leetcode.algorithms.util;

public class TestCase<E> {
    private final E expected;

    public TestCase(E expected) {
        this.expected = expected;
    }

    public E getExpected() {
        return expected;
    }
}
