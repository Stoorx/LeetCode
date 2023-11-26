package one.stoorx.leetcode.algorithms;

import org.junit.jupiter.api.Nested;
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
        var list1 = ListHelper.fromArray(number1);
        var list2 = ListHelper.fromArray(number2);
        var listExpected = ListHelper.fromArray(expected);
        assertEquals(listExpected, addTwoNumbers.addTwoNumbers(list1, list2));
    }

    static class ListHelper {
        public static AddTwoNumbers.ListNode fromArray(int[] array) {
            if (array != null)
                return convertRecursive(array, 0);
            else return null;
        }

        private static AddTwoNumbers.ListNode convertRecursive(int[] array, int i) {
            if (i < array.length) {
                return new AddTwoNumbers.ListNode(array[i], convertRecursive(array, i + 1));
            } else return null;
        }
    }

    @Nested
    class ListHelperTest {
        static class FromArrayArgumentProvider implements ArgumentsProvider {
            @Override
            public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
                return Stream.of(
                        Arguments.of(
                                new int[]{5, 6, 4},
                                new AddTwoNumbers.ListNode(5,
                                        new AddTwoNumbers.ListNode(6,
                                                new AddTwoNumbers.ListNode(4)))),
                        Arguments.of(
                                new int[]{0},
                                new AddTwoNumbers.ListNode(0)
                        ),
                        Arguments.of(null, null)
                );
            }
        }

        @ParameterizedTest
        @ArgumentsSource(FromArrayArgumentProvider.class)
        void fromArray(int[] array, AddTwoNumbers.ListNode expectedList) {
            assertEquals(expectedList, ListHelper.fromArray(array));
        }
    }
}