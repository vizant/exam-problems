package com.khozhaev;

public class Task8 {

    /**
     * Найти медиану в массиве вещественных чисел. Для вычисления
     * медианы массив следует упорядочить по возрастанию и, в случае нечётного
     * количества членов, взять средний элемент, а в случае чётного количества
     * членов взять среднее арифметическое между двумя «средними» членами.
     */

    public double findMedianOfTheArray(double[] arr) {
        sortArray(arr);
        if (arr.length % 2 == 0) {
            return (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
        }
        return arr[arr.length / 2];
    }

    private void sortArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[j - 1]) {
                    double temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
