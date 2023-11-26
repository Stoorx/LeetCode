package one.stoorx.leetcode.algorithms;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseBitsTest {
    private final ReverseBits reverseBits = new ReverseBits();

    @ParameterizedTest
    @ArgumentsSource(ReverseBitsArgumentsProvider.class)
    void reverseBits(int expected, int input) {
        assertEquals(expected, reverseBits.reverseBits(input));
    }

    static class ReverseBitsArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(0b00111001011110000010100101000000, 0b00000010100101000001111010011100),
                    Arguments.of(0b10111111111111111111111111111111, 0b11111111111111111111111111111101)
            );
        }
    }
}