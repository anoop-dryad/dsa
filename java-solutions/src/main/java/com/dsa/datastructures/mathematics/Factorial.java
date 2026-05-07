package com.dsa.datastructures.mathematics;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int number = args.length > 0 ? Integer.parseInt(args[0]) : 0;
        BigInteger factorial = getFactorial(number);
        System.out.printf("Factorial of the given number %d is %d", number, factorial);
    }

    // developer thought process
    public static int getFactorialOfANumber(int number) {
        if (number == 0) {
            return 1;
        }

        return number * getFactorialOfANumber(number - 1);
    }

    // Staff level thought
    public static BigInteger getFactorial(int number) {
        if (number < 0 || number > 1000) {
            throw new IllegalArgumentException("min=0 and max=1000");
        }
        if (number == 0 || number == 1) {
            return BigInteger.ONE;
        }
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;

    }
}
