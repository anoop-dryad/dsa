package com.dsa.datastructures.searching;

public class PairWithGivenSum {
    public static boolean checkIfPairAvailableInGivenArray(int[] inputArray, int sum) {
        int i = 0;
        int j = inputArray.length - 1;
        while (i < j) {
            if (inputArray[i] + inputArray[j] < sum) {
                i++;
            } else if (inputArray[i] + inputArray[j] > sum) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }
}
