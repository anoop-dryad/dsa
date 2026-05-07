package com.dsa.datastructures.arrays;

public class ReverseAnArray {
    public static int[] reversedArray(int[] inputArray) {
        int arrayLength = inputArray.length;
        for (int i = 0; i < arrayLength / 2; i++) {
            int temp = inputArray[i];
            inputArray[i] = inputArray[arrayLength - 1 - i];
            inputArray[arrayLength - 1 - i] = temp;
        }
        return inputArray;
    }
}
