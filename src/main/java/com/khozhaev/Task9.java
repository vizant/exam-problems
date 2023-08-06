package com.khozhaev;

public class Task9 {

    /**
     * Найти среднее арифметическое всех элементов под побочной и главной
     * диагональю целочисленной квадратной матрицы (включая прилегающие
     * элементы диагоналей).
     */

    public double findArithmeticMeanOnBottomInclusive(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i + j + 1 >= matrix.length && i >= j) {
                    sum += matrix[i][j];
                    count++;
                }
            }
        }
        return (double) sum / count;
    }
}
