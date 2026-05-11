package com.dsa.datastructures.arrays;

public class StockBuyAndSell {
    public static int getMaxProfit(int[] inputArray){
        int maxProfit=0;
        for(int i=1; i<inputArray.length;i++){
            if(inputArray[i]>inputArray[i-1]){
                maxProfit +=(inputArray[i]-inputArray[i-1]);
            }
        }
        return maxProfit;
    }
}
