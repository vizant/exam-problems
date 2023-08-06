package com.khozhaev;

public class Task2 {

    /**
     * Найти среднее арифметическое всех элементов слева от побочной и
     * главной диагонали целочисленной квадратной матрицы.
     */

    public double findArithmeticMeanOnLeftSide(double[][] matrix) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j || i + j + 1 == matrix.length) {
                    break;
                }
                sum += matrix[i][j];
                count++;
            }
        }
        return sum / count;
    }
}
