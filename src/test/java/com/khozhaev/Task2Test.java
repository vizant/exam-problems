package com.khozhaev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Task2Test {

    private static final Task2 TASK_2 = new Task2();

    @ParameterizedTest
    @MethodSource("inputDataAndExpectedResult")
    void successTest(double[][]arr, double expected) {
        Assertions.assertEquals(expected, TASK_2.findArithmeticMeanOnLeftSide(arr));
    }

    private static Stream<Arguments> inputDataAndExpectedResult() {
        return Stream.of(
                Arguments.of(
                        new double[][] {
                                {1,1,1,1},
                                {1,1,1,1},
                                {3,1,1,1},
                                {1,1,1,1},
                        }, 2
                )
        );
    }
}
