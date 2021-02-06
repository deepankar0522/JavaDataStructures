package com.java.algorithm;

public class InsertionSort {
    public static void main(String[] args) {
        int[] inputArray = {21, 45, 23, -21, 1, 0, 23, -4};

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
