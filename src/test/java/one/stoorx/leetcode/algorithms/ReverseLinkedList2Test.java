package one.stoorx.leetcode.algorithms;

import one.stoorx.leetcode.algorithms.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLinkedList2Test {
    private final ReverseLinkedList2 reverseLinkedList2 = new ReverseLinkedList2();

    @Test
    void reverseBetween() {
        assertEquals(ListNode.fromArray(new int[]{1, 4, 3, 2, 5}),
                reverseLinkedList2.reverseBetween(ListNode.fromArray(new int[]{1, 2, 3, 4, 5}), 2, 4));
        assertEquals(ListNode.fromArray(new int[]{5}),
                reverseLinkedList2.reverseBetween(ListNode.fromArray(new int[]{5}), 1, 1));
        assertEquals(ListNode.fromArray(new int[]{3, 5}),
                reverseLinkedList2.reverseBetween(ListNode.fromArray(new int[]{3, 5}), 1, 1));
    }
}