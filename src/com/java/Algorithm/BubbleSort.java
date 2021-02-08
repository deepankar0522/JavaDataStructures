package com.java.Algorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] inputArray = {21, 45, 23, -21, 1, 0, 23, -4};
        for (int lastUnsortedIndex = inputArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (inputArray[i] > inputArray[i + 1])
                    swap(inputArray, i, i + 1);
            }
        }
        for (int j : inputArray) {
            System.out.println(j);
        }
    }

    public static void swap(int[] inputArray, int i, int j) {
        if (i == j)
            return;
        if (inputArray[i] != inputArray[j]) {
            int temp = inputArray[i];
            inputArray[i] = inputArray[j];
            inputArray[j] = temp;
        }
    }
}
