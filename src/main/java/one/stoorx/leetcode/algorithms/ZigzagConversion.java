package one.stoorx.leetcode.algorithms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Task: 6. Zigzag Conversion
// Link: https://leetcode.com/problems/zigzag-conversion
// Level: Medium
public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        List<StringBuilder> stringBuilders = Stream.generate(StringBuilder::new).limit(numRows).toList();
        for (int i = 0; i < s.length(); ) {
            for (int j = 0; j < stringBuilders.size() - 1 && i < s.length(); ++j, ++i)
                stringBuilders.get(j).append(s.charAt(i));
            for (int j = stringBuilders.size() - 1; j > 0 && i < s.length(); --j, ++i)
                stringBuilders.get(j).append(s.charAt(i));
        }
        return stringBuilders.stream().map(StringBuilder::toString).collect(Collectors.joining());
    }
}
