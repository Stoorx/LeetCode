package one.stoorx.leetcode.algorithms;

import one.stoorx.leetcode.algorithms.util.ListNode;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersTest {
    private final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    static class AddTwoNumbersTestCaseArgumentsSource implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(new int[]{2, 4, 3}, new int[]{5, 6, 4}, new int[]{7, 0, 8}),
                    Arguments.of(new int[]{0}, new int[]{0}, new int[]{0}),
                    Arguments.of(new int[]{9, 9, 9, 9, 9, 9, 9}, new int[]{9, 9, 9, 9}, new int[]{8, 9, 9, 9, 0, 0, 0, 1})
            );
        }
    }

    @ParameterizedTest
    @ArgumentsSource(AddTwoNumbersTestCaseArgumentsSource.class)
    void addTwoNumbers(int[] number1, int[] number2, int[] expected) {
        var list1 = ListNode.fromArray(number1);
        var list2 = ListNode.fromArray(number2);
        var listExpected = ListNode.fromArray(expected);
        assertEquals(listExpected, addTwoNumbers.addTwoNumbers(list1, list2));
    }
}