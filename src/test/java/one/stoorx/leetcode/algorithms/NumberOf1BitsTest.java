package one.stoorx.leetcode.algorithms;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOf1BitsTest {
    private final NumberOf1Bits numberOf1Bits = new NumberOf1Bits();

    @ParameterizedTest
    @ArgumentsSource(HammingWeightArgumentsProvider.class)
    void hammingWeight(int expected, int input) {
        assertEquals(expected, numberOf1Bits.hammingWeight(input));
    }

    static class HammingWeightArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(3, 0b00000000000000000000000000001011),
                    Arguments.of(1, 0b00000000000000000000000010000000),
                    Arguments.of(31, 0b11111111111111111111111111111101),
                    Arguments.of(0, 0)
            );
        }
    }
}