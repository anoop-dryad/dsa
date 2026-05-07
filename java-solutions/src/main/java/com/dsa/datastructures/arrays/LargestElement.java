package com.dsa.datastructures.arrays;

public class LargestElement {
    /**
     * FIND LARGEST ELEMENT IN AN ARRAY
     * * Concept:
     * Iterates through a linear collection of numbers to identify the 
     * maximum value. This is a fundamental "Linear Search" pattern.
     * * The Logic:
     * 1. Initialize a 'max' variable with the first element of the array 
     * (or Integer.MIN_VALUE).
     * 2. Loop through the remaining elements.
     * 3. If the current element is greater than 'max', update 'max'.
     * 4. Return 'max' after one full pass.
     * * Time Complexity:
     * O(n) — We must visit every element exactly once.
     * * Space Complexity:
     * O(1) — Only a single variable is used for tracking the maximum.
     * * Practical Use Cases:
     * 1. DATA ANALYSIS: Finding the "Peak" value in a dataset, such as 
     * the highest temperature recorded or the max price of a stock.
     * 2. MONITORING: Identifying the maximum latency or CPU usage 
     * spike in your FUOTA or backend services.
     * 3. RESOURCE MANAGEMENT: Determining the largest file size in a 
     * directory (e.g., photos of the Breite Strasse mold issue) 
     * to allocate sufficient upload buffer.
     * * Staff-Level Tip:
     * Always handle the "Empty Array" edge case. A robust implementation 
     * should either throw an IllegalArgumentException or return a 
     * sentinel value if the input array length is 0.
     */
    public static int getLargestElelmentInAnArray(int[] inputArray){
        if (inputArray == null || inputArray.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int max = inputArray[0];
        for(int i=0; i<inputArray.length;i++){
            if(inputArray[i]>max){
                max = inputArray[i];
            }
        }
        return max;
    }
}
