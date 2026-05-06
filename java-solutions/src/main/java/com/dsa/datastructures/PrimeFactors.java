package com.dsa.datastructures;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    /**
     * PRIME FACTORIZATION (Trial Division)
     * 
     * Concept:
     *     Every composite number can be expressed as a unique product of prime 
     *     numbers (Fundamental Theorem of Arithmetic). The algorithm repeatedly 
     *     divides the number by the smallest possible prime factors, starting 
     *     from 2, until the remaining value is 1.
     * 
     * The Logic:
     *     1. Divide by 2 repeatedly to remove all even factors.
     *     2. Iterate through odd numbers starting from 3 up to sqrt(n).
     *     3. If 'n' is still greater than 2 after the loop, the remaining 'n' 
     *        is itself a prime factor.
     * 
     * Time Complexity:
     *     O(sqrt(n)) — In the worst case (a prime number), the loop runs 
     *     until the incrementing divisor exceeds the square root of n.
     * 
     * Space Complexity:
     *     O(log n) — To store the list of prime factors.
     * 
     * Practical Use Cases:
     *     1. CRYPTOGRAPHY: The security of RSA encryption relies on the fact 
     *        that while multiplying two large primes is easy, finding the 
     *        prime factors of a massive product is computationally "hard."
     *     2. DATA NORMALIZATION: Used to find the "canonical form" of numbers 
     *        in distributed database sharding or load-balancing logic.
     *     3. COMPUTER ALGEBRA: Essential for simplifying radical expressions, 
     *        finding the number of divisors, or calculating the Euler's totient function.
     * 
     * Staff-Level Testing Tip:
     *     When testing in modern Java (Java 9+), use the 'List' interface 
     *     rather than 'ArrayList' in method signatures. This ensures 
     *     compatibility with immutable collections created by List.of().
     */
    public static List<Integer> getPrimeFactors(int number){
        List<Integer> primeFactors = new ArrayList<>();
        if (number<=1) return primeFactors;
        while(number%2 == 0){
            primeFactors.add(2);
            number/=2;
        }
        while (number%3 == 0){
            primeFactors.add(3);
            number/=3;
        }
        for(int i=5; i*i<=number; i+=6){
            while(number%i==0){
                primeFactors.add(i);
                number/=i;
            }
            while(number%(i+2)==0){
                primeFactors.add(i+2);
                number/=(i+2);
            }
        }

        if(number>3){
            primeFactors.add(number);
        }

        return primeFactors;
    }
}
