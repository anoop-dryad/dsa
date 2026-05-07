package com.dsa.datastructures.mathematics;

public class TrailingZerosInFactorial {
    /*
        The Trailing Zero Logic (Legendre's Formula)

        Concept:
            A trailing zero is created by the product of 2*5. 
            In the expansion of n!, prime factors of 2 are always more abundant than prime factors of 5. 
            Therefore, the number of trailing zeros is determined strictly by the total count of the factor 5 in the prime factorization of n!.

        The Formula:
            To account for numbers that contain multiple factors of 5 (like 25 = 5*5, 125 = 5*5*5 etc.), 
            we use the summation of the floor of $n$ divided by powers of 5:
                Trailing Zeros  = Sum(n/5 + n/25 + n/125 +...)

        Time Complexity:
            O(logn)

        Note:
        This formula helps us to protect from overflow, since its not calculating the exact factorial whcih might leads to overflow in java.

    */
    public static int getTrailingZerosInFactorial(int number){
        int trailingZeros=0;
        for (int i=5; i<=number; i=i*5){
            trailingZeros = trailingZeros+ (number/i);
        }

        return  trailingZeros;

    }
}
