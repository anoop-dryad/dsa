package com.dsa.datastructures.arrays;

public class CheckIfArraySorted {
    public static boolean checkIfArrayIsSorted(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < inputArray[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
