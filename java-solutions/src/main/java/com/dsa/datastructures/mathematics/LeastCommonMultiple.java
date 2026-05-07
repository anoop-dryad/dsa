package com.dsa.datastructures.mathematics;

public class LeastCommonMultiple {
    /**
     * THE LEAST COMMON MULTIPLE (LCM)
     * 
     * Practical Usecase:
     * - Synchronization of Events: In your FUOTA (Firmware Over-The-Air) service,
     * if one device sends a "heartbeat" every 6 seconds and another every 10
     * seconds, they will both broadcast simultaneously at the LCM of 6 and 10,
     * which is every 30 seconds.
     * - Traffic Light Timing: City planners use LCM to coordinate traffic lights.
     * If one light turns green every 45 seconds and another nearby turns green
     * every 60 seconds, they will sync up every $LCM(45, 60) = 180$ seconds (3
     * minutes).
     * 
     * Concept:
     * The LCM of two integers 'a' and 'b' is the smallest positive integer that
     * is divisible by both 'a' and 'b'. It represents the first point where
     * the multiples of two numbers coincide.
     * 
     * The Formula (Relation to GCD):
     * The most efficient way to calculate LCM is using its mathematical
     * relationship with the Greatest Common Divisor (GCD):
     * 
     * LCM(a, b) = (|a * b|) / GCD(a, b)
     * 
     * Staff-Level Optimization (The "Division First" Rule):
     * To prevent intermediate integer overflow, we should perform the
     * division before the final multiplication:
     * 
     * LCM(a, b) = (|a| / GCD(a, b)) * |b|
     * 
     * Time Complexity:
     * O(log(min(a, b))) - Same as the underlying GCD (Euclidean Algorithm).
     * 
     * Space Complexity:
     * O(1) - Constant space when using the iterative GCD.
     * 
     * Staff-Level Advantages:
     * 1. Overflow Protection: By dividing by the GCD first, we keep the
     * intermediate product smaller. This is critical in languages like Java
     * where 'int' or 'long' have fixed limits.
     * 2. Efficiency: It avoids "brute force" incrementing, which would be
     * O(LCM(a, b))—potentially millions of iterations for large primes.
     * 3. Reusability: It leverages the existing, robust GCD function as a
     * modular building block.
     */
    public static int getLeastCommonMultiple(int a, int b) {
        if (a == 0 || b == 0)
            return 0;
        int gcd = getGcd(a, b);
        return Math.abs(a / gcd * b);
    }

    private static int getGcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
