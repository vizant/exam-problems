package com.khozhaev;

public class Task3 {

    /**
     * Найти среднее арифметическое всех элементов справа от побочной и
     * главной диагонали целочисленной квадратной матрицы (включая
     * прилегающие элементы диагоналей).
     */

    public double findArithmeticMeanOnRightSideInclusive(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                sum += matrix[i][j];
                count++;
                if (i == j || i + j + 1 == matrix.length) {
                    break;
                }
            }
        }
        return (double) sum / count;
    }
}
