package com.khozhaev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task11Test {

    private static final Task11 TASK_11 = new Task11();

    @MethodSource("inputDataAndExpectedResult")
    @ParameterizedTest
    void successTest(int[][] matrix, double expected) {
        Assertions.assertEquals(expected, TASK_11.findArithmeticMeanOnTop(matrix));
    }

    private static Stream<Arguments> inputDataAndExpectedResult() {
        return Stream.of(
                Arguments.of(
                        new int[][]{
                                {1, 4, 6, 3},
                                {1, 3, 3, 1},
                                {1, 4, 4, 7},
                                {2, 2, 2, 4}
                        }, 5
                )
        );
    }

}