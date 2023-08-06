package com.khozhaev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task4Test {

    private static final Task4 TASK_4 = new Task4();

    @MethodSource("inputDataAndExpectedResult")
    @ParameterizedTest
    void successTest(int[][] matrix, double expected) {
        Assertions.assertEquals(expected, TASK_4.findArithmeticMeanOnRightSide(matrix));
    }

    private static Stream<Arguments> inputDataAndExpectedResult() {
        return Stream.of(
                Arguments.of(
                        new int[][]{
                                {1, 1, 1, 1},
                                {1, 1, 1, 3},
                                {1, 1, 1, 1},
                                {1, 1, 1, 1}
                        }, 2
                )
        );
    }

}