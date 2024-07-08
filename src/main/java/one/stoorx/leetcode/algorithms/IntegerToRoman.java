package one.stoorx.leetcode.algorithms;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

// Task: 12. Integer to Roman
// Link: https://leetcode.com/problems/integer-to-roman
// Level: Medium
public class IntegerToRoman {
    private static final SortedMap<Integer, String> stops = new TreeMap<>(Comparator.comparingInt(value -> -value)) {{
        put(1, "I");
        put(4, "IV");
        put(5, "V");
        put(9, "IX");
        put(10, "X");
        put(40, "XL");
        put(50, "L");
        put(90, "XC");
        put(100, "C");
        put(400, "CD");
        put(500, "D");
        put(900, "CM");
        put(1000, "M");
    }};

    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int remain = num;
        for (Map.Entry<Integer, String> entry : stops.entrySet()) {
            while (remain >= entry.getKey()) {
                remain -= entry.getKey();
                result.append(entry.getValue());
            }
        }
        return result.toString();
    }
}
