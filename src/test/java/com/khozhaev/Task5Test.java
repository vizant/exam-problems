package com.khozhaev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task5Test {

    private static final Task5 TASK_5 = new Task5();

    @ParameterizedTest
    @MethodSource("inputDataAndExpectedResult")
    void successTest(int[] arr, int expected) {
        Assertions.assertEquals(expected, TASK_5.findStartIndexOfTheLongestSubSequence(arr));
    }

    private static Stream<Arguments> inputDataAndExpectedResult() {
        return Stream.of(
                Arguments.of(new int[]{1}, 0),
                Arguments.of(new int[]{1, 2}, 0),
                Arguments.of(new int[]{1, 2, 3, 3, 4}, 2),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 5, 5}, 4)
        );
    }
}