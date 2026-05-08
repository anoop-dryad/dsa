package com.dsa.datastructures.arrays;

/*
    Our Task: Given two arrays L[ ] and R[ ] of size N where L[i] and R[i] (0 ? L[i], R[i] < 10^6) denotes a range of numbers, 
    the task is to find the maximum occurred integer in all the ranges. 
    If more than one such integer exists, print the smallest one.      
*/
public class MaxAppearingElement {
    private static final int MAX_RANGE_VALUE = 10000000;

    public static int getMaxAppearingElement(int[] leftArray, int[] rightArray){
        int leftArrayLength = leftArray.length;
        int rightArrayLength = rightArray.length;

        if(leftArrayLength!=rightArrayLength){
            throw new IllegalArgumentException("Invalid input array, cant make pairs");
        }

        int[] differenceArray = new int[MAX_RANGE_VALUE + 2];

        // create the difference array
        for(int i=0; i<leftArrayLength;i++){
            differenceArray[leftArray[i]]++;
            differenceArray[rightArray[i]+1]--;
        }

        int maxOccurrence = differenceArray[0];
        int resultElement = 0;

        // create the prefix sum array
        for(int i=1; i<=MAX_RANGE_VALUE;i++){
            differenceArray[i] += differenceArray[i-1];
            if(differenceArray[i]>maxOccurrence){
                maxOccurrence = differenceArray[i];
                resultElement = i;
            }
        }
       return  resultElement;

    }
}
