package one.stoorx.leetcode.algorithms;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        var complements = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; i++){
            complements.put(target - nums[i], i);
        }
        for (int i = 0; i < nums.length; i++){
            var complementIndex = complements.get(nums[i]);
            if(complementIndex != null && complementIndex != i){
                return new int[]{i, complementIndex};
            }
        }
        return null;
    }
}

