package com.khozhaev;

public class Task4 {

    /**
     * Найти среднее арифметическое всех элементов справа от побочной и
     * главной диагонали целочисленной квадратной матрицы (включая
     * прилегающие элементы диагоналей).
     */

    public double findArithmeticMeanOnRightSide(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                if (i == j || i + j + 1 == matrix.length) {
                    break;
                }
                sum += matrix[i][j];
                count++;
            }
        }
        return (double) sum / count;
    }

}
