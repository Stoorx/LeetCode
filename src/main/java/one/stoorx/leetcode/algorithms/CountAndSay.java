package one.stoorx.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountAndSay {
    public String countAndSay(int n) {
        return countAndSayRecursive(n).stream().map(Object::toString).collect(Collectors.joining(""));
    }

    private List<Integer> countAndSayRecursive(int n) {
        if (n == 1) return List.of(1);
        List<Integer> numbers = countAndSayRecursive(n - 1);
        List<NumberPair> pairs = new ArrayList<>();
        int prevDigit = numbers.get(0);
        int digitCounter = 1;
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) != prevDigit) {
                pairs.add(new NumberPair(prevDigit, digitCounter));
                prevDigit = numbers.get(i);
                digitCounter = 1;
            } else digitCounter++;
        }
        pairs.add(new NumberPair(prevDigit, digitCounter));
        List<Integer> result = new ArrayList<>();
        for (NumberPair numberPair : pairs) {
            result.add(numberPair.count());
            result.add(numberPair.digit());
        }
        return result;
    }

    record NumberPair(int digit, int count) {
    }
}
