package com.khozhaev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task3Test {

    private static final Task3 TASK_3 = new Task3();

    @MethodSource("inputDataAndExpectedResult")
    @ParameterizedTest
    void successTest(int[][] matrix, double expected) {
        Assertions.assertEquals(expected, TASK_3.findArithmeticMeanOnRightSideInclusive(matrix));
    }

    private static Stream<Arguments> inputDataAndExpectedResult() {
        return Stream.of(
                Arguments.of(
                        new int[][]{
                                {9, 1, 1, 1},
                                {9, 1, 1, 3},
                                {3, 1, 1, 3},
                                {9, 1, 1, 3}
                        }, 2
                )
        );
    }

}