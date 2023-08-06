package com.khozhaev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task7Test {

    private static final Task7 TASK_3 = new Task7();

    @ParameterizedTest
    @MethodSource("inputDataAndExpectedResult")
    void successTest(int[][] matrix, double expected) {
        Assertions.assertEquals(TASK_3.findArithmeticMeanOnLeftSideInclusive(matrix), expected);
    }

    private static Stream<Arguments> inputDataAndExpectedResult() {
        return Stream.of(
                Arguments.of(
                        new int[][]{
                                {1,1,1,9},
                                {1,2,1,9},
                                {2,2,1,9},
                                {1,1,1,9}
                        }, 1.5
                )
        );
    }
}