package com.dsa.datastructures.mathematics;

import java.util.ArrayList;
import java.util.List;

public class AllDivisors {
    /**
     * ALL DIVISORS OF AN INTEGER
     * 
     * Concept:
     * A divisor is any integer that divides 'n' without a remainder.
     * Divisors always occur in pairs (if 'i' is a divisor, then 'n/i'
     * is also a divisor). This allows us to find all divisors by
     * only iterating up to the square root of 'n'.
     * 
     * The Logic:
     * 1. Iterate from 1 to sqrt(n).
     * 2. If (n % i == 0):
     * a. Add 'i' to the list.
     * b. If 'i' is not the same as 'n/i' (to handle perfect squares),
     * add 'n/i' to the list.
     * 3. Sorting the list at the end is optional but recommended for
     * standardized output.
     * 
     * Time Complexity:
     * O(sqrt(n)) — Iterates only up to the square root. Sorting the
     * resulting list takes O(D log D) where D is the number of divisors.
     * 
     * Space Complexity:
     * O(D) — Where D is the number of divisors stored in the list.
     * 
     * Practical Use Cases:
     * 1. PERFECT NUMBERS: Used to determine if a number is "Perfect" (sum of proper
     * divisors equals the number), "Abundant," or "Deficient."
     * 2. RESOURCE ALLOCATION: Determining how a fixed set of items can be split
     * into equal groups (e.g., splitting a batch of 120 firmware updates into
     * equal-sized sub-batches for FUOTA).
     * 3. CRYPTANALYSIS: Finding factors of large numbers to analyze vulnerabilities
     * in weak encryption implementations.
     * 
     * Staff-Level Tip:
     * When using Java 21+, use the 'List' interface and consider
     * 'Collections.sort()' if your logic requires the divisors to
     * be in ascending order.
     */
    public static List<Integer> getAllDivisors(int number) {
        List<Integer> list = new ArrayList<>();
        if (number < 1)
            return list;
        int i;
        for (i = 1; i * i < number; i++) {
            if (number % i == 0) {
                list.add(i);
            }
        }
        for (; i >= 1; i--) {
            if (number % i == 0) {
                list.add(number / i);
            }
        }
        return list;
    }
}
