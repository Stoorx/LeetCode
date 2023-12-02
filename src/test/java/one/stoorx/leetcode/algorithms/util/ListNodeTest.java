package one.stoorx.leetcode.algorithms.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ListNodeTest {

    @Test
    void testEquals() {
        assertEquals(new ListNode(5), new ListNode(5));
        assertEquals(new ListNode(0), new ListNode(0));
        assertEquals(new ListNode(40, new ListNode(10)), new ListNode(40, new ListNode(10)));
        assertNotEquals(new ListNode(10), new ListNode(5));
        assertNotEquals(new ListNode(10, new ListNode(5)), new ListNode(10));
        assertNotEquals(new ListNode(10, new ListNode(5)), new ListNode(10, new ListNode(20)));
    }

    @Test
    void testHashCode() {
        assertEquals(new ListNode(10).hashCode(), new ListNode(10).hashCode());
        assertNotEquals(new ListNode(20).hashCode(), new ListNode(10).hashCode());
    }

    @Test
    void testToString() {
        assertEquals("ListNode{val=10, next=null}", new ListNode(10).toString());
        assertEquals("ListNode{val=10, next=ListNode{val=-2, next=null}}", new ListNode(10, new ListNode(-2)).toString());
    }

    @ParameterizedTest
    @ArgumentsSource(FromArrayArgumentProvider.class)
    void fromArray(int[] array, ListNode expectedList) {
        assertEquals(expectedList, ListNode.fromArray(array));
    }

    static class FromArrayArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(
                            new int[]{5, 6, 4},
                            new ListNode(5,
                                    new ListNode(6,
                                            new ListNode(4)))),
                    Arguments.of(
                            new int[]{0},
                            new ListNode(0)
                    ),
                    Arguments.of(null, null)
            );
        }
    }

}