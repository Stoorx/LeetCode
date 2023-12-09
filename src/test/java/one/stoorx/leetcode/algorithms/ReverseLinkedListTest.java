package one.stoorx.leetcode.algorithms;

import one.stoorx.leetcode.algorithms.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLinkedListTest {
    private final ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    @Test
    void reverseList() {
        assertEquals(ListNode.fromArray(new int[]{}),
                reverseLinkedList.reverseList(ListNode.fromArray(new int[]{})));
        assertEquals(ListNode.fromArray(new int[]{1}),
                reverseLinkedList.reverseList(ListNode.fromArray(new int[]{1})));
        assertEquals(ListNode.fromArray(new int[]{1, 2}),
                reverseLinkedList.reverseList(ListNode.fromArray(new int[]{2, 1})));
        assertEquals(ListNode.fromArray(new int[]{1, 2, 3, 4, 5}),
                reverseLinkedList.reverseList(ListNode.fromArray(new int[]{5, 4, 3, 2, 1})));

    }
}