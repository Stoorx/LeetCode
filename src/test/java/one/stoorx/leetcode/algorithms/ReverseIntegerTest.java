package one.stoorx.leetcode.algorithms;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    private final ReverseInteger reverseInteger = new ReverseInteger();

    @ParameterizedTest
    @ArgumentsSource(ReverseArgumentProvider.class)
    void reverse(int expected, int actual) {
        assertEquals(expected, reverseInteger.reverse(actual));
    }

    static class ReverseArgumentProvider implements ArgumentsProvider{
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(321, 123),
                    Arguments.of(-321, -123),
                    Arguments.of(21, 120),
                    Arguments.of(0, 0),
                    Arguments.of(0, 1234512345),
                    Arguments.of(-189, -9810),
                    Arguments.of(-4301, -1034)
            );
        }
    }
}