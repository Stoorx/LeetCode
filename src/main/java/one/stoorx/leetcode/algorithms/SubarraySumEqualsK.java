package one.stoorx.leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Task: 560. Subarray Sum Equals K
// Link: https://leetcode.com/problems/subarray-sum-equals-k
// Level: Medium
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        final Map<Integer, Integer> sumCounter = new HashMap<>() {{
            put(0, 1);
        }};
        int count = 0;
        int cumulativeSum = 0;
        for (int i : nums) {
            cumulativeSum += i;
            count += sumCounter.getOrDefault(cumulativeSum - k, 0);
            sumCounter.compute(cumulativeSum, (key, oldValue) -> Objects.requireNonNullElse(oldValue, 0) + 1);
        }
        return count;
    }
}
