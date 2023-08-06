package com.khozhaev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task9Test {

    private static final Task9 TASK_9 = new Task9();

    @MethodSource("inputDataAndExpectedResult")
    @ParameterizedTest
    void successTest(int[][] matrix, double expected) {
        Assertions.assertEquals(expected, TASK_9.findArithmeticMeanOnBottomInclusive(matrix));
    }

    private static Stream<Arguments> inputDataAndExpectedResult() {
        return Stream.of(
                Arguments.of(
                        new int[][]{
                                {9, 9, 1, 1},
                                {1, 1, 8, 1},
                                {1, 4, 4, 7},
                                {2, 2, 2, 4}
                        }, 3
                )
        );
    }

}