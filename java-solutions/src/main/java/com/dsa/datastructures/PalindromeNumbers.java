package com.dsa.datastructures;



public class PalindromeNumbers {
    public static void main(String[] args) {
        int input = args.length>0?Integer.parseInt(args[0]):0;
        boolean isPalindrome = isNumberPalindrome(input);
        System.out.printf("Given number is %s%n", isPalindrome?"Palindrome":"not Palindrome");
    }

    public static boolean isNumberPalindrome(int inputNumber){
        int reversedNumber =0;
        int tempNumber = inputNumber;
        while(tempNumber>0){
            int lastDigit = tempNumber%10;
            tempNumber = tempNumber/10;
            reversedNumber = reversedNumber*10 + lastDigit;
        }

        return reversedNumber==inputNumber;
    }

    public static boolean isNumberPalindromeEfficient(int number){
        if(number<0 || (number%10==0 && number!=0)) return false;
        int reversedNumber = 0;
        while(number>reversedNumber){
            reversedNumber = (reversedNumber*10)+(number%10);
            number/=10;
        }
        //to handle odd and even numbers.
        return (reversedNumber==number) || (reversedNumber/10==number);
    }
}
