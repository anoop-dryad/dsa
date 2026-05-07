package com.dsa.datastructures.arrays;

public class RemoveDuplicates {
    public static int removeDuplicatesFromArray(int[] inputArray) {
        int arrayLength = inputArray.length;
        int pointer = 0;
        for (int i = 1; i < arrayLength; i++) {
            if (inputArray[i] != inputArray[pointer]) {
                pointer++;
                inputArray[pointer] = inputArray[i];

            }
        }
        return pointer + 1;
    }
}
