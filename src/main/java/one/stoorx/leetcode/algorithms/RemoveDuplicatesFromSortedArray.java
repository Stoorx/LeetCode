package one.stoorx.leetcode.algorithms;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 0, prev = nums[0]; i < nums.length; i++) {
            if (nums[i] != prev) {
                prev = nums[i];
                nums[k] = prev;
                k++;
            }
        }
        return k;
    }
}
