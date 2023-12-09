package one.stoorx.leetcode.algorithms;

import java.util.HashMap;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer, Character> reorderMap = new HashMap<>(indices.length);
        for (int i = 0; i < s.length(); i++) {
            reorderMap.put(indices[i], s.charAt(i));
        }
        StringBuilder stringBuilder = new StringBuilder(indices.length);
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(reorderMap.get(i));
        }
        return stringBuilder.toString();
    }
}
