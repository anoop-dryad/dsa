package com.dsa.datastructures.mathematics;

public class PrimeNumbers {

    /**
     * OPTIMIZED PRIMALITY TEST (Trial Division)
     * 
     * Concept:
     *     A prime number is only divisible by 1 and itself. To check efficiently, 
     *     we use two mathematical shortcuts:
     *     1. Square Root Limit: A composite number 'n' must have a factor 
     *        less than or equal to sqrt(n).
     *     2. 6k +/- 1 Rule: All primes greater than 3 can be written in the 
     *        form 6k +/- 1. This allows us to skip 2/3 of all integers.
     * 
     * Time Complexity:
     *     O(sqrt(n)) - Significantly faster than O(n) for large integers.
     * 
     * Space Complexity:
     *     O(1) - Constant space.
     * 
     * Staff-Level Advantages:
     *     1. Performance: Reducing iterations from 'n' to 'sqrt(n)' is the 
     *        difference between a system hang and a near-instant result.
     *     2. Edge Case Safety: Explicitly handles 0, 1, and negative numbers.
     *     3. Arithmetic Efficiency: Using `i * i <= number` is slightly 
     *        more performant than calling `Math.sqrt()` in every iteration.
     * 
     * Practical Use Cases:
     *     1. CYBERSECURITY: The foundation of RSA encryption; generating public 
     *        keys requires finding and verifying massive primes.
     *     2. HASHING: Setting Hash Table sizes to prime numbers to minimize 
     *        data collisions and ensure uniform distribution.
     *     3. LOAD BALANCING: Using primes in "Consistent Hashing" to distribute 
     *        network traffic evenly across server clusters.
     */
    
    public static boolean isNumberPrime(int number){
        if (number==1 || number==0) return false;
        int i=2;
        while(i<number){
            if (number%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isNumberPrimeEfficient(int number){
        if (number<=1) return false;
        if (number<=3) return true;
        if (number%2 == 0 || number%3==0) return false;
        for (int i=5; i*i<number; i+=6){
            if (number%i == 0 || number%(i+2) == 0){
                return false;
            }
        }
        return true;
    }
}
