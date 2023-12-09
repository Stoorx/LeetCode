package one.stoorx.leetcode.algorithms;

import one.stoorx.leetcode.algorithms.util.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;

        ListNode current = head;
        ListNode prev = null;
        do {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        } while (current != null);
        return prev;
    }
}
