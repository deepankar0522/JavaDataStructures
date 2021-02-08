package com.java.Algorithm;

public class InsertionSort {
    public static void main(String[] args) {
        int[] inputArray = {21, 45, 23, -21, 1, 0, 23, -4};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < inputArray.length; firstUnsortedIndex++) {
            int newElement = inputArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && inputArray[i - 1] > newElement; i--) {
                inputArray[i] = inputArray[i-1];
            }
            inputArray[i] = newElement;
        }
        for (int i: inputArray) {
            System.out.println(i);
        }
    }
}
