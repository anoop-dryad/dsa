package com.dsa.datastructures.arrays;

public class MaxConsecutiveOnes {
    /**
     * Given a binary array, find the count of the maximum number of consecutive 1's present in the array.
     */
    public static int getMaxConsecutiveOnesAvailable(int[] inputArray){
        int count=0;
        int maxCount=0;
        for(int i=0; i<inputArray.length; i++){
            if(inputArray[i]==1){
                count++;
                maxCount=Math.max(maxCount, count);
            }else{
                count=0;
            }
        }
        return maxCount;
    }
}
