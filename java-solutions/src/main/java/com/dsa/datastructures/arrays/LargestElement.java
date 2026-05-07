package com.dsa.datastructures.arrays;

public class LargestElement {
    public static int getLargestElelmentInAnArray(int[] inputArray){
        int max = 0;
        for(int i=0; i<inputArray.length;i++){
            if(inputArray[i]>max){
                max = inputArray[i];
            }
        }
        return max;
    }
}
