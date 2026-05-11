package com.dsa.datastructures.searching;

public class IndexOfFirstOccurrence {
    public static int getIndexOfFirstOccurrence(int[] inputArray, int elementToSearch) {
        int len = inputArray.length;
        int low = 0;
        int high = len - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int value = inputArray[mid];
            if (inputArray[mid] < elementToSearch) {
                low = mid + 1;
            } else if (inputArray[mid] > elementToSearch) {
                high = mid - 1;
            } else {
                if (value == elementToSearch) {
                    if (mid == 0 || inputArray[mid - 1] != value) {
                        return mid;
                    } else {
                        high = mid;
                    }
                }
            }
        }
        return -1;

    }
}
