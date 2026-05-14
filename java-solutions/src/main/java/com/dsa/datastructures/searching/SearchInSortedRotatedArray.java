package com.dsa.datastructures.searching;

public class SearchInSortedRotatedArray {
    public static int findNumberInArray(int[] inputArray, int number) {
        int low = 0;
        int high = inputArray.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (inputArray[mid] == number) {
                return mid;
            }
            // Identify which side is sorted
            if (inputArray[low] <= inputArray[mid]) {
                // Left side is sorted
                if (number < inputArray[mid] && number >= inputArray[low]) {
                    high = mid - 1; // Target is in the sorted left half
                } else {
                    low = mid + 1; // Target must be in the right half
                }
            } else {
                // Right side is sorted
                if (number > inputArray[mid] && number <= inputArray[high]) {
                    low = mid + 1; // Target is in the sorted right half
                } else {
                    high = mid - 1; // Target must be in the left half
                }
            }

        }
        return -1;
    }
}
