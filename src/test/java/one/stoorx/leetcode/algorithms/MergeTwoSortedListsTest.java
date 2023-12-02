package one.stoorx.leetcode.algorithms;

import one.stoorx.leetcode.algorithms.util.ListNode;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoSortedListsTest {
    private final MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @ParameterizedTest
    @ArgumentsSource(MergeTwoListsArgumentsProvider.class)
    void mergeTwoLists(ListNode expected, ListNode list1, ListNode list2) {
        assertEquals(expected, mergeTwoSortedLists.mergeTwoLists(list1, list2));
    }

    static class MergeTwoListsArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(
                            ListNode.fromArray(new int[]{1, 1, 2, 3, 4, 4}),
                            ListNode.fromArray(new int[]{1, 2, 4}),
                            ListNode.fromArray(new int[]{1, 3, 4})
                    ),
                    Arguments.of(
                            ListNode.fromArray(new int[]{}),
                            ListNode.fromArray(new int[]{}),
                            ListNode.fromArray(new int[]{})
                    ),
                    Arguments.of(
                            ListNode.fromArray(new int[]{0}),
                            ListNode.fromArray(new int[]{}),
                            ListNode.fromArray(new int[]{0})
                    )
            );
        }
    }
}