package com.dsa.datastructures.arrays;

/*
    Given a circular array of size n, find the maximum subarray sum of the non-empty subarray.
 */
public class MaxCircularSumSubArray {
    /**
     * Algorithm : Kadane's Algorithm
     * @param inputArray
     * @return
     */
    public static int getMaxCircularSumSubArray(int[] inputArray){
        int currentMax=0;
        int maxSum=inputArray[0];
        int currentMin=0;
        int minSum = inputArray[0];
        int totalSum = 0;

        for(int num:inputArray){
            // 1. Standard Kadane's (to find Max Subarray)
            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(currentMax, maxSum);

            // 2. Reverse Kadane's (to find Min Subarray)
            currentMin = Math.min(num, currentMin + num);
            minSum =Math.min(currentMin, minSum);

            // 3. Keep track of total sum for the wrap-around calculation
            totalSum+=num;
        }

            
        // Edge Case: If all numbers are negative, maxSoFar will be the 
        // largest single element. totalSum - minSoFar would result in 0 
        // (an empty subarray), which is usually not allowed.
        if(maxSum<0){
            return maxSum;
        }

        // Return the better of the two scenarios
        return Math.max(maxSum, totalSum-minSum);
    }
}
