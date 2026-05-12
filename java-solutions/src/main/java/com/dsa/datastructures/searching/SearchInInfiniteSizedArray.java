package com.dsa.datastructures.searching;

public class SearchInInfiniteSizedArray {
    public static int checkIfValuePresentInInfiniteSizedArray(int[] inputArray, int value) {

        if (inputArray[0] == value) {
            return 0;
        }
        int i = 1;
        while (inputArray[i] < value) {
            i = i * 2;
        }

        if (inputArray[i] == value) {
            return 0;
        }

        return binarySearch(inputArray, (i / 2 + 1), i - 1, value);

    }

    private static int binarySearch(int[] inputArray, int low, int high, int value) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (inputArray[mid] == value) {
                return 0;
            } else if (inputArray[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
