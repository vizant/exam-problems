package com.khozhaev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Task1Test {

    private static final Task1 TASK_1 = new Task1();

    @ParameterizedTest
    @MethodSource("inputDataAndExpectedResult")
    void successTest(int[] arr, int expected) {
        int actual = TASK_1.findStartIndexOfTheShortestSubSequence(arr);
        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> inputDataAndExpectedResult() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2, 3, 4}, 0),
                Arguments.of(new int[]{1, 2, 2, 3, 4, 4, 4, 5, 5}, 1),
                Arguments.of(new int[]{1, 2, 3, 4, 4}, 3)
        );
    }

    @Test
    void whenShortestSequenceLengthLessThanOneThanThrowException() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Assertions.assertThrows(RuntimeException.class, () -> TASK_1.findStartIndexOfTheShortestSubSequence(arr));
    }
}