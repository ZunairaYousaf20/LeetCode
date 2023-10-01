package com.learning.leetcode.slidingwindow;

public class MaximumSumSubArrayOfSizeK {

    public static void main(String[] args) {
        int[] array = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        System.out.println("Maximum Sum of Sub-Array of Size 4: " +findMaximumSumSubArray(array, 4));
    }

    private static int findMaximumSumSubArray(int[] array, int k) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

 /*       //brute force approach with time complexity O(n*k)
        for (int idx0 = 0; idx0 + k <= array.length; idx0++) {
            int currentSum = 0;

            for (int idx1 = idx0; idx1 < idx0 + k; idx1++) {
                currentSum = currentSum + array[idx1];
            }

            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
        }*/
        for(int idx = 0; idx < array.length; idx++) {
            currentSum += array[idx];

            if(idx >= k - 1) {
                maxSum = Math.max(currentSum, maxSum);
                currentSum -= array[idx - k + 1];
            }
        }

        return maxSum;
    }


}
