package com.dsa.datastructures;

import java.math.BigInteger;

/*
 * BigInteger is used to handle very large numbers that may exceed the limits of primitive data types like int or long.
 * The countDigits method counts the number of digits in a given BigInteger by repeatedly dividing the number by 10 
 * until it becomes zero, incrementing a count variable each time. 
 * If the input number is zero, it returns 1 since zero has one digit. 
 * The main method reads a number from the command line arguments, converts it to a BigInteger, and calls the countDigits method to
 */
public class CountDigits {
    public static void main(String[] args) {
        
        String number = args.length > 0? args[0]:"0";
        try{
            BigInteger bignumber = new BigInteger(number);
            int count = countDigits(bignumber);
            System.out.println("Number of digits: " + count);
        }catch(NumberFormatException e){
            System.out.println("Invalid input. Please provide a valid integer.");
        }
    }

    /*
        in loop: number>0
            last digit removed number = number/10
            count++
    */
    public static int countDigits(BigInteger number){
        if (number.equals(BigInteger.ZERO)) return 1;
        BigInteger temp = number;
        int count=0;
        while(temp.compareTo(BigInteger.ZERO)>0){
            temp = temp.divide(BigInteger.TEN);
            count++;
        }
        return count;
    }

    
}   
