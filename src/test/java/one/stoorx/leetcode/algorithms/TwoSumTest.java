package one.stoorx.leetcode.algorithms;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    private final TwoSum twoSum = new TwoSum();

    static class TwoSumTestCaseArgumentsSource implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(new int[]{0, 1}, new int[]{2, 7, 11, 15}, 9),
                    Arguments.of(new int[]{1, 2}, new int[]{3, 2, 4}, 6),
                    Arguments.of(new int[]{0, 1}, new int[]{3, 3}, 6)
            );
        }
    }

    @ParameterizedTest
    @ArgumentsSource(TwoSumTestCaseArgumentsSource.class)
    void twoSum(int[] expected, int[] numbers, int target) {
        assertArrayEquals(
                Arrays.stream(expected).sorted().toArray(),
                Arrays.stream(twoSum.twoSum(numbers, target)).sorted().toArray()
        );
    }
}