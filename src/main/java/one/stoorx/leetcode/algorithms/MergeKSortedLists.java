package one.stoorx.leetcode.algorithms;


import one.stoorx.leetcode.algorithms.util.ListNode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

// Task: 23. Merge k Sorted Lists
// Link: https://leetcode.com/problems/merge-k-sorted-lists
// Level: Hard
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null)
            return null;
        PriorityQueue<ListNode> listNodes = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));
        listNodes.addAll(Arrays.stream(lists).filter(Objects::nonNull).toList());
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while (listNodes.size() > 0) {
            ListNode minimumNode = listNodes.remove();
            tail.next = minimumNode;
            tail = minimumNode;
            if (minimumNode.next != null)
                listNodes.add(minimumNode.next);
        }
        return head.next;
    }
}
