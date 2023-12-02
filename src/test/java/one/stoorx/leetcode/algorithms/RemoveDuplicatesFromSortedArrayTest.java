package one.stoorx.leetcode.algorithms;

import one.stoorx.leetcode.algorithms.util.TestCase;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArrayTest {
    private final RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @ParameterizedTest
    @ArgumentsSource(RemoveDuplicatesFromSortedArrayArgumentsProvider.class)
    void removeDuplicates(RemoveDuplicatesFromSortedArrayTestResult expected, int[] input) {
        expected.validate(removeDuplicatesFromSortedArray.removeDuplicates(input), input);
    }

    record RemoveDuplicatesFromSortedArrayTestResult(int expectedK, int[] expectedArray) {
        public void validate(int k, int[] array) {
            assertEquals(expectedK, k);
            for (int i = 0; i < k; i++)
                assertEquals(expectedArray[i], array[i]);
        }
    }

    static class RemoveDuplicatesFromSortedArrayTestCase
            extends TestCase<RemoveDuplicatesFromSortedArrayTestResult>
            implements Arguments {
        private final int[] input;

        RemoveDuplicatesFromSortedArrayTestCase(RemoveDuplicatesFromSortedArrayTestResult result, int[] array) {
            super(result);
            input = array;
        }

        public int[] getInput() {
            return input;
        }

        @Override
        public Object[] get() {
            return new Object[]{getExpected(), getInput()};
        }
    }

    static class RemoveDuplicatesFromSortedArrayArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    new RemoveDuplicatesFromSortedArrayTestCase(
                            new RemoveDuplicatesFromSortedArrayTestResult(2, new int[]{1, 2, -1}),
                            new int[]{1, 1, 2}
                    ),
                    new RemoveDuplicatesFromSortedArrayTestCase(
                            new RemoveDuplicatesFromSortedArrayTestResult(5, new int[]{0, 1, 2, 3, 4}),
                            new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}
                    )
            );
        }
    }
}