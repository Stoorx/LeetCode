package one.stoorx.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

// Task: 22. Generate Parentheses
// Link: https://leetcode.com/problems/generate-parentheses/
// Level: Medium
public class GenerateParentheses {
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generateRecursively(n, 0, 0, "");
        return result;
    }

    private void generateRecursively(int n, int leftCount, int rightCount, String currentString) {
        if (currentString.length() == 2 * n){
            result.add(currentString);
            return;
        }
        if (leftCount < n)
            generateRecursively(n, leftCount + 1, rightCount, currentString + '(');
        if(leftCount > rightCount)
            generateRecursively(n, leftCount, rightCount + 1, currentString + ')');
    }
}
