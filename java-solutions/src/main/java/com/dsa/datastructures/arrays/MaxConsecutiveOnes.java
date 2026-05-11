package com.dsa.datastructures.arrays;

public class MaxConsecutiveOnes {
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
