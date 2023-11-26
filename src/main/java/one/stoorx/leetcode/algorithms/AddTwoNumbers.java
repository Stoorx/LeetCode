package one.stoorx.leetcode.algorithms;

import java.util.Objects;

public class AddTwoNumbers {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoDigits(l1, l2, false);
    }

    private ListNode addTwoDigits(ListNode l1, ListNode l2, boolean carry){
        if(l1 == null && l2 == null){
            return carry ? new ListNode(1): null;
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
