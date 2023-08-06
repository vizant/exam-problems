package com.khozhaev;

public class Task6 {

    /**
     * Найти среднее арифметическое всех элементов под побочной и главной
     * диагональю целочисленной квадратной матрицы.
     */

    public double findArithmeticMeanOnBottom(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i > j && i + j + 1 > matrix.length) {
                    sum += matrix[i][j];
                    count++;
                }
            }
        }
        return (double) sum/ count;
    }
}
