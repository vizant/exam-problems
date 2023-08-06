package com.khozhaev;

public class Task1 {

    /**
     * Найти индекс начала наиболее короткой (не менее двух) и
     * непрерывной последовательности одинаковых чисел в целочисленном
     * массиве.
     */

    public int findStartIndexOfTheShortestSubSequence(int[] arr) {
        int minLength = arr.length;
        int minIndex = -1;
        int currentLength = 1;
        int currentIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > 1 && currentLength < minLength) {
                    minIndex = currentIndex;
                    minLength = currentLength;
                }
                currentLength = 1;
                currentIndex = i;
            }
        }
        if (currentLength > 1 && currentLength < minLength) {
            return currentIndex;
        }
        if (minIndex == -1) {
            throw new RuntimeException();
        }
        return minIndex;
    }
}