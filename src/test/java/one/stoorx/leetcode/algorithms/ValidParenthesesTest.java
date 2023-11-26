package one.stoorx.leetcode.algorithms;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidParenthesesTest {
    private final ValidParentheses validParentheses = new ValidParentheses();

    @ParameterizedTest
    @ArgumentsSource(IsValidArgumentsProvider.class)
    void isValid(boolean expected, String s) {
        assertEquals(expected, validParentheses.isValid(s));
    }

    static class IsValidArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(true, "()"),
                    Arguments.of(true, "()[]{}"),
                    Arguments.of(true, "([{}])[]{}"),
                    Arguments.of(true, ""),
                    Arguments.of(false, "(]"),
                    Arguments.of(false, "]"),
                    Arguments.of(false, "]}"),
                    Arguments.of(false, "["),
                    Arguments.of(false, "[(")
            );
        }
    }

}