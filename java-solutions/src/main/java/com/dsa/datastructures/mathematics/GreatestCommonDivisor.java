package com.dsa.datastructures.mathematics;

public class GreatestCommonDivisor {
    /**
     * THE EUCLIDEAN ALGORITHM (Greatest Common Divisor)
     * 
     * Practical Usecase:
     * 
     * - Simplifying Fractions and Ratios: In computer graphics or UI design, GCD is
     * used to calculate the Aspect Ratio of a screen (e.g., 1920x1080 reduces to
     * 16:9). Dividing both dimensions by their GCD (120) ensures the ratio is in
     * its simplest form.
     * - Tile and Layout Design: If you have a floor measuring 24ft by 36ft and you
     * want to use the largest possible square tiles without cutting any, the tile
     * size must be the GCD of 24 and 36 (which is 12).
     * 
     * Concept:
     * The GCD of two numbers is the largest positive integer that divides both
     * numbers without
     * a remainder. The Euclidean Algorithm operates on the principle that the GCD
     * of two
     * numbers also divides their difference. Specifically: gcd(a, b) = gcd(b, a %
     * b).
     * 
     * The Logic:
     * 1. The algorithm is self-correcting; if 'a' is smaller than 'b', the first
     * modulo operation (a % b) effectively swaps the numbers.
     * 2. We repeat the process until the remainder becomes zero.
     * 3. The last non-zero divisor is the GCD.
     * 
     * The Formula (Iterative):
     * While b != 0:
     * temp = b
     * b = a % b
     * a = temp
     * Return a
     * 
     * Time Complexity:
     * O(log(min(a, b))) - Extremely efficient even for massive numbers.
     * 
     * Space Complexity:
     * O(1) - The iterative approach uses constant space.
     * 
     * Staff-Level Advantages:
     * 1. Memory Safety: Unlike recursion, this iterative approach carries zero risk
     * of StackOverflowError in Java or Python.
     * 2. Robustness: By using Math.abs() or absolute values, the logic correctly
     * handles negative integers.
     * 3. Simplicity: It avoids unnecessary "if (a < b)" checks as the modulo
     * operator
     * handles the swap naturally in the first iteration.
     */
    public static int getGreatestCommonDivisor(int a, int b) {
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
