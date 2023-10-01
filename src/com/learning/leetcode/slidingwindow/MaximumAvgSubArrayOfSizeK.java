package com.learning.leetcode.slidingwindow;

public class MaximumAvgSubArrayOfSizeK {

    public static void main(String[] args) {
        int[] array = {1,12,-5,-6,50,3};
        System.out.println("Maximum Average of Sub-Array of Size 4: " +findMaximumSumSubArray(array, 4));
    }

    private static Double findMaximumSumSubArray(int[] array, int k) {
        double maxSum = Integer.MIN_VALUE;
        double currentSum = 0.0d;

        for(int idx = 0; idx < array.length; idx++) {
            currentSum += array[idx];

            if(idx >= k - 1) {
                maxSum = Math.max(currentSum, maxSum);
                currentSum -= array[idx - k + 1];
            }
        }
        return maxSum/k;
    }


}
