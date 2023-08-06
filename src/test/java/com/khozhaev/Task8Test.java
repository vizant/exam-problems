package com.khozhaev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task8Test {
    private static final Task8 TASK_8 = new Task8();

    @ParameterizedTest
    @MethodSource("inputDataAndExpectedResult")
    void successTest(double[] arr, double expected) {
        double actual = TASK_8.findMedianOfTheArray(arr);
        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> inputDataAndExpectedResult() {
        return Stream.of(
                Arguments.of(new double[]{3, 2, 1}, 2),
                Arguments.of(new double[]{5, 4, 3, 1, 1, 2}, 2.5),
                Arguments.of(new double[]{2, 1}, 1.5),
                Arguments.of(new double[]{5, 4, 3, 2, 1}, 3)
        );
    }
}
