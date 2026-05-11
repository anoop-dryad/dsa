package com.dsa.datastructures.arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesInArray {
    public static Map<Integer, Integer> getFrequenciesInArray(int[] inputArray){
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i=0; i<inputArray.length; i++){
            frequencyMap.merge(inputArray[i], 1, Integer::sum);
        }

        return  frequencyMap;
    }
}
