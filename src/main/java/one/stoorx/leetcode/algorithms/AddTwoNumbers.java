package one.stoorx.leetcode.algorithms;

import one.stoorx.leetcode.algorithms.util.ListNode;


public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoDigits(l1, l2, false);
    }

    private ListNode addTwoDigits(ListNode l1, ListNode l2, boolean carry) {
        if (l1 == null && l2 == null) {
            return carry ? new ListNode(1) : null;
        }

        int val1 = l1 != null ? l1.val : 0;
        int val2 = l2 != null ? l2.val : 0;
        int currentDigit = val1 + val2 + (carry ? 1 : 0);
        return new ListNode(
                currentDigit % 10,
                addTwoDigits(l1 != null ? l1.next : null, l2 != null ? l2.next : null, (currentDigit / 10 != 0))
        );
    }
}
