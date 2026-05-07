package com.dsa.datastructures.arrays;

public class SecondLargestElementIndexInAnArray {
    /**
     * FIND SECOND LARGEST ELEMENT (Single Pass)
     * * Concept:
     * Traverses the array once while maintaining two "slots": the 
     * Absolute Maximum and the Runner-Up. This avoids the O(n log n) 
     * cost of sorting the entire collection.
     * * The Logic:
     * 1. Initialize 'max' and 'secondMax' to the smallest possible integer.
     * 2. For every element 'x':
     * a. If x > max: Current 'max' becomes 'secondMax', and 'x' 
     * becomes the new 'max'.
     * b. If max > x > secondMax: Only 'secondMax' is updated.
     * * Time Complexity: 
     * O(n) — A single linear scan through the array.
     * * Space Complexity: 
     * O(1) — Uses only two variables regardless of input size.
     * * Practical Use Cases:
     * 1. REDUNDANCY PLANNING: Identifying the "Backup" server or system 
     * with the next highest capacity in a FUOTA cluster if the 
     * primary fails.
     * 2. COMPETITIVE ANALYSIS: Finding the second-best price or 
     * quote for repairs (like the window/door issues at 
     * Schopfurter Strasse 6) to have a fallback option.
     * 3. STATISTICAL OUTLIERS: Filtering out the absolute peak to 
     * understand the "typical" high-end performance of a system.
     * * Staff-Level Tip:
     * Always decide how to handle duplicates. If the array is [10, 10, 8], 
     * should the second largest be 10 or 8? The logic above returns 8 
     * (distinct second largest), which is usually what is required in 
     * technical interviews.
     */
    public static int getSecondLargestElement(int[] inputArray){
        if(inputArray.length<1) {
            throw new IllegalArgumentException("Invalid Array");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0; i<inputArray.length; i++){
            if(inputArray[i]>max){
                secondMax = max;
                max = inputArray[i];
            }else if(inputArray[i]>secondMax && inputArray[i]!=max){
                secondMax = inputArray[i];
            }
        }
        if(secondMax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element");
        }

        return secondMax;
    }
}
