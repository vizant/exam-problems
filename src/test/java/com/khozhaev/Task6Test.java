package com.khozhaev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task6Test {
    private static final Task6 TASK_6 = new Task6();

    @MethodSource("inputDataAndExpectedResult")
    @ParameterizedTest
    void successTest(int[][] matrix, double expected) {
        Assertions.assertEquals(expected, TASK_6.findArithmeticMeanOnBottom(matrix));
    }

    private static Stream<Arguments> inputDataAndExpectedResult() {
        return Stream.of(
                Arguments.of(
                        new int[][]{
                                {9, 9, 1, 1},
                                {1, 1, 8, 1},
                                {1, 1, 1, 7},
                                {1, 4, 2, 1}
                        }, 3
                )
        );
    }
}