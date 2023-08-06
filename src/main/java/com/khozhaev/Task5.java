package com.khozhaev;

public class Task5 {

    /**
     * Найти индекс начала наиболее длинной и непрерывной
     * последовательности одинаковых чисел в целочисленном массиве.
     */

    public int findStartIndexOfTheLongestSubSequence(int[] arr) {
        if (arr.length == 0) {
            throw new RuntimeException();
        }
        if (arr.length == 1) {
            return 0;
        }
        int maxLength = -1;
        int maxIndex = -1;
        int currentLength = 1;
        int currentIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxIndex = currentIndex;
                }
                currentIndex = i;
                currentLength = 1;
            }
        }

        if (currentLength > maxLength) {
            return currentIndex;
        }
        return maxIndex;
    }
}
