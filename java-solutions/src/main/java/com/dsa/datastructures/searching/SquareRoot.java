package com.dsa.datastructures.searching;

public class SquareRoot {
    public static int getSquareRoot(int value) {
        int low = 0;
        int high = value;
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            int squareValue = mid * mid;
            if (squareValue == value) {
                return mid;
            } else if (squareValue < value) {
                low = mid + 1;
                ans = mid;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
