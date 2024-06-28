package one.stoorx.leetcode.algorithms;


import one.stoorx.leetcode.algorithms.util.ListNode;

// Task: 23. Merge k Sorted Lists
// Link: https://leetcode.com/problems/merge-k-sorted-lists
// Level: Hard
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        int[] counting = new int[20001];
        for (ListNode list : lists) {
            for (ListNode currentNode = list; currentNode != null; currentNode = currentNode.next) {
                ++counting[currentNode.val + 10000];
            }
        }
        ListNode currentListNode = null;
        for (int i = counting.length - 1; i >= 0; --i) {
            for (int j = 0; j < counting[i]; ++j) {
                currentListNode = new ListNode(i - 10000, currentListNode);
            }
        }
        return currentListNode;
    }
}
