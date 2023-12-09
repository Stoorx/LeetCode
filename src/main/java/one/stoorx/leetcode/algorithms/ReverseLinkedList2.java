package one.stoorx.leetcode.algorithms;

import one.stoorx.leetcode.algorithms.util.ListNode;

public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;

        ListNode beforeFirst = null;
        ListNode afterLast;
        ListNode startNode = null;
        ListNode prevNode = null;
        ListNode currentNode = head;
        int currentPosition = 1;
        while (true) {
            if (currentPosition == left) {
                beforeFirst = prevNode;
                startNode = currentNode;
            }
            if (currentPosition == right) {
                afterLast = currentNode.next;
                break;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
            currentPosition++;
        }

        currentNode = startNode;
        prevNode = afterLast;
        do {
            ListNode next = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = next;
        } while (currentNode != afterLast);
        if (beforeFirst != null) {
            beforeFirst.next = prevNode;
            return head;
        } else return prevNode;
    }
}
