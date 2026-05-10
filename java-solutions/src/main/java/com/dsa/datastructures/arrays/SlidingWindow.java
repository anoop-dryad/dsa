package com.dsa.datastructures.arrays;

/**
 * Find the max sum of K consecutive elements
 */
public class SlidingWindow {
    /**
     * SLIDING WINDOW TECHNIQUE (Fixed Size)
     * 
     * * Concept:
     * A computational optimization used to perform operations on a specific
     * subset (window) of data that "slides" across a larger data set. Instead
     * of recalculating the entire subset sum from scratch, it updates the sum
     * by adding the 'new' element and subtracting the 'old' element.
     * 
     * * Mathematical Definition:
     * Sum(i) = Sum(i-1) + A[i] - A[i - K]
     * Where K is the window size.
     * 
     * * Time Complexity:
     * - Naive Approach: O(N * K) (Nested loops re-summing K elements)
     * - Optimized Approach: O(N) (Single pass, constant time updates)
     * 
     * * Space Complexity:
     * - O(1) as we only maintain two variables (currSum and resSum).
     * 
     * * Why "Sliding Window"?
     * Imagine a physical window on a wall. As you slide it to the right,
     * you don't need to rebuild the window; you just see new scenery
     * on the right and lose scenery on the left. In code, this prevents
     * redundant calculations.
     * 
     * * Practical Use Cases:
     * 1. NETWORK TELEMETRY: Calculating the max throughput (Mbps) over a
     * rolling 10-second window in high-traffic routers.
     * 2. FINANCIAL TRADING: Moving averages or identifying the most
     * profitable K-minute window for high-frequency trading.
     * 3. AUDIO PROCESSING: Calculating the peak signal-to-noise ratio in
     * a continuous stream of digital audio.
     * 4. SENSOR MONITORING: Detecting the highest average temperature
     * reading over a specific duration in an industrial furnace.
     * 
     * * Staff-Level Tip:
     * The Sliding Window is the discrete version of a "Moving Average."
     * Whenever you see the word "consecutive" or "contiguous" combined
     * with a "maximum/minimum/average," this technique should be your
     * immediate first thought.
     */
    public static int maxSumOfSubArray(int[] inputArray, int subArrayLength) {
        int currSum = 0;
        for (int i = 0; i < subArrayLength; i++) {
            currSum += inputArray[i];
        }
        int resSum = currSum;
        for (int i = subArrayLength; i < inputArray.length; i++) {
            currSum = currSum + inputArray[i] - inputArray[i - subArrayLength];
            resSum = Math.max(currSum, resSum);
        }

        return resSum;
    }
}
