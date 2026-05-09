package com.dsa.datastructures.arrays;

/*
 * Given a sequence arr[ ] of size n, Write a function int equilibrium(int[]
 * arr, int n) that returns an equilibrium index (if any) or -1 if no
 * equilibrium index exists.
 */
public class EquillibriumPoint {

    /**
     * EQUILIBRIUM POINT (The Pivot Index)
     * 
     * * Concept:
     * An equilibrium point is an index in an array such that the sum of
     * elements at lower indices is equal to the sum of elements at higher
     * indices. It represents the "balance center" of the data set.
     * 
     * * Mathematical Definition:
     * For an index `i`, it is an equilibrium point if:
     * A[0] + A[1] + ... + A[i-1] == A[i+1] + A[i+2] + ... + A[n-1]
     * Note: The element at index `i` itself is typically excluded from both sums.
     * 
     * * Time Complexity:
     * - Naive Approach: O(N²) (Checking every index with nested loops)
     * - Optimized Approach: O(N) (Using total sum and a running left sum)
     * 
     * * Space Complexity:
     * - O(1) as it only requires a few variables for tracking sums.
     * 
     * * Why "Equilibrium"?
     * Derived from the Latin 'aequilibrium' (equal balance). In physics,
     * it's the state where all acting forces cancel each other out. In
     * programming, it's where the "weight" of the data is perfectly partitioned.
     * 
     * * Practical Use Cases:
     * 1. LOAD BALANCING: Distributing tasks across two processors such that
     * the computational "weight" on either side of a split is equal.
     * 2. DATA PARTITIONING: Finding the optimal split point in a database
     * shard to ensure both partitions handle equal traffic/storage.
     * 3. FINANCIAL AUDITING: Identifying a specific transaction in a ledger
     * where the historical total matches the future projected total.
     * 4. SIGNAL ANALYSIS: Detecting the "null point" in a waveform where
     * the energy distribution shifts from one phase to another.
     * 
     * * Staff-Level Tip:
     * Think of the Equilibrium Point as the "Median" of values rather than
     * the median of counts. While the Prefix Sum is your "Integral,"
     * the Equilibrium Point is finding the specific coordinate where:
     * (Total_Sum - Current_Element) / 2 == Left_Running_Sum
     */
    public static boolean checkEquillibriumPoint(int[] inputArray) {
        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            rightSum += inputArray[i];
        }

        for (int i = 0; i < inputArray.length; i++) {
            rightSum -= inputArray[i];
            if (leftSum == rightSum)
                return true;
            leftSum += inputArray[i];
        }

        return false;
    }
}
