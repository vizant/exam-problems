package com.khozhaev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task10Test {

    private static final Task10 TASK_10 = new Task10();

    @MethodSource("inputDataAndExpectedResult")
    @ParameterizedTest
    void successTest(int[][] matrix, double expected) {
        Assertions.assertEquals(expected, TASK_10.findArithmeticMeanOnTopInclusive(matrix));
    }

    private static Stream<Arguments> inputDataAndExpectedResult() {
        return Stream.of(
                Arguments.of(
                        new int[][]{
                                {1, 1, 1, 3},
                                {1, 3, 3, 1},
                                {1, 4, 4, 7},
                                {2, 2, 2, 4}
                        }, 2
                )
        );
    }

}