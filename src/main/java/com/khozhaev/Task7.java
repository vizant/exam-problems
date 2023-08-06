package com.khozhaev;

public class Task7 {

    /**
     * Найти среднее арифметическое всех элементов слева от побочной и
     * главной диагонали целочисленной квадратной матрицы (включая
     * прилегающие элементы диагоналей).
     */

    public double findArithmeticMeanOnLeftSideInclusive(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
                count++;
                if (i == j || i + j + 1 == matrix.length) {
                    break;
                }
            }
        }
        return (double) sum/count;
    }
}
