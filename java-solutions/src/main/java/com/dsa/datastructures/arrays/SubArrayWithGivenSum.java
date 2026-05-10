package com.dsa.datastructures.arrays;

public class SubArrayWithGivenSum {
    /**
     * SLIDING WINDOW (Variable Size) - Subarray with Given Sum
     * 
     * * Concept:
     * Uses two pointers (left and right) to create a "window" that expands to
     * include more elements and contracts to exclude them. It is used to find
     * a contiguous sequence that satisfies a specific sum constraint.
     * 
     * * Mathematical Definition:
     * Find range [i, j] such that: Σ (A[i]...A[j]) = Target_Sum
     * 
     * * Time Complexity:
     * O(N) - Although there is a nested while loop, each element is visited
     * at most twice (once by the right pointer and once by the left).
     * 
     * * Space Complexity:
     * O(1) - Only requires pointers and a sum variable.
     * 
     * * Why "Variable" Window?
     * Unlike the fixed-size window (where the width is constant), this window
     * grows when the sum is too small and shrinks when the sum is too large.
     * It behaves like an "accordion."
     * 
     * * Practical Use Cases:
     * 1. LOG ANALYSIS: Finding a time window where a server received exactly
     * X number of error requests to pinpoint a system failure.
     * 2. GENOMICS: Identifying a DNA sub-sequence where the count of specific
     * nucleotides matches a target pattern.
     * 3. BUDGETING APP: Finding a consecutive period of days where a user's
     * spending exactly hit their budget limit.
     * 4. NETWORK PACKETS: Identifying a sequence of data packets that equals
     * a specific frame size for reassembly.
     * 
     * * Staff-Level Tip:
     * This specific algorithm only works for non-negative integers. If the array
     * contains negative numbers, the "growing sum" logic breaks, and you must
     * use a Prefix Sum with a HashMap (O(N) space) instead.
     */
    public static boolean checkSubArrayWithGivenSumIsPresent(int[] inputArray, int sum) {

        int currSum = 0;
        int leftPos = 0;
        for (int i = 0; i < inputArray.length; i++) {
            currSum += inputArray[i];
            while (currSum > sum) {
                currSum -= inputArray[leftPos];
                leftPos++;
            }
            if (currSum == sum) {
                return true;
            }
        }
        return false;
    }
}
