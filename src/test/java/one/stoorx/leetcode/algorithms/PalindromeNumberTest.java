package one.stoorx.leetcode.algorithms;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeNumberTest {
    private final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @ParameterizedTest
    @ArgumentsSource(IsPalindromeArgumentsProvider.class)
    void isPalindrome(boolean expected, int input) {
        assertEquals(expected, palindromeNumber.isPalindrome(input));
    }

    static class IsPalindromeArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(true, 121),
                    Arguments.of(false, -121),
                    Arguments.of(false, 10),
                    Arguments.of(true, 0),
                    Arguments.of(true, 543212345),
                    Arguments.of(false, 1111111119)
            );
        }
    }
}