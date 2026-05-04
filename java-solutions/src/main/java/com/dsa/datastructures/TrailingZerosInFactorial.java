package com.dsa.datastructures;

public class TrailingZerosInFactorial {
    
    public static int getTrailingZerosInFactorial(int number){
        int trailingZeros=0;
        for (int i=5; i<=number; i=i*5){
            trailingZeros = trailingZeros+ (number/i);
        }

        return  trailingZeros;

    }
}
