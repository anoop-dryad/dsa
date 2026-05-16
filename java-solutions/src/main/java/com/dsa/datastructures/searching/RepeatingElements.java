package com.dsa.datastructures.searching;

/*
In this problem, we have an array where each element appears only once except 
for a single element that has multiple occurrences. Additionally, the array always contains the number 0, 
and if the maximum element in the array is x, then all elements from 0 to x are guaranteed to be present in the array. 
We will have a look at both the naive and the efficient approach to solve this proble 
*/
public class RepeatingElements {
    /*
     * Floyd's Cycle Detection
     * Floyd's cycle detection on arrays fundamentally assumes values are in range
     * [1..n].
     * 
     */
    public static int findRepeatingElementsWithoutZero(int[] inputArray) {

        int slow = inputArray[0];
        int fast = inputArray[inputArray[0]];
        while (slow != fast) {
            slow = inputArray[slow];
            fast = inputArray[inputArray[fast]];
        }

        slow = 0;
        while (slow != fast) {
            slow = inputArray[slow];
            fast = inputArray[fast];
        }
        return slow;
    }

    /*
     * 0 creates a self-loop at the head — the algorithm collapses because the
     * traversal never progresses. hence it breals the normal Floyds algo..
     * Tweak the existing algo to satisfy the question to accomodate 0.
     */
    public static int findRepeatingElementsWithZero(int[] inputArray) {
        // Remap: shift all values up by 1 → now in [1..n]
        for (int i = 0; i < inputArray.length; i++)
            inputArray[i]++;

        int slow = inputArray[0];
        int fast = inputArray[inputArray[0]];
        while (slow != fast) {
            slow = inputArray[slow];
            fast = inputArray[inputArray[fast]];
        }

        slow = 0;
        while (slow != fast) {
            slow = inputArray[slow];
            fast = inputArray[fast];
        }
        // Remap back: subtract 1 from result
        return slow - 1;
    }
}
