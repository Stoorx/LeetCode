package one.stoorx.leetcode.algorithms;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CountingBitsTest {
    private final CountingBits countingBits = new CountingBits();

    @ParameterizedTest
    @ArgumentsSource(CountBitsArgumentsProvider.class)
    void countBits(int[] expected, int n) {
        assertArrayEquals(expected, countingBits.countBits(n));
    }

    static class CountBitsArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(new int[]{0}, 0),
                    Arguments.of(new int[]{0, 1, 1}, 2),
                    Arguments.of(new int[]{0, 1, 1, 2, 1, 2}, 5)
            );
        }
    }
}