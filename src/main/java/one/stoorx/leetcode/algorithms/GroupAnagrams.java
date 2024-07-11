package one.stoorx.leetcode.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

// Task: 49. Group Anagrams
// Link: https://leetcode.com/problems/group-anagrams
// Level: Medium
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        return Arrays.stream(strs).collect(
                Collectors.groupingBy(
                        s -> s.chars().boxed().collect(
                                Collectors.groupingBy(Function.identity(), Collectors.counting())
                        ),
                        Collectors.toList()
                )
        ).values().stream().toList();
    }
}
