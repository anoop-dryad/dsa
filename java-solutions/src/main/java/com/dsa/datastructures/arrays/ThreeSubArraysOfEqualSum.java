package com.dsa.datastructures.arrays;

public class ThreeSubArraysOfEqualSum {
    public static boolean checkIf3SubArrysWithEqualSumPossible(int[] inputArray) {
        int prefixSum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            prefixSum += inputArray[i];
        }

        if (prefixSum % 3 != 0)
            return false;

        int count = 0;
        int runningSum = 0;
        int targetSum = prefixSum / 3;
        for (int i = 0; i < inputArray.length; i++) {
            runningSum += inputArray[i];
            if (runningSum == targetSum) {
                runningSum = 0;
                count++;
            }
        }

        return count >= 3;
    }
}
