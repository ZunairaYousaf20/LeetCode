package com.learning.leetcode.slidingwindow;

public class MinimumSubArrayLength {

    static int findMinimumSubArrayLen(int[] nums, int target) {
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;
        int winStart = 0;

        for (int winEnd = 0; winEnd < nums.length; winEnd++) {
            currentSum += nums[winEnd];

            while(currentSum >= target) {
                minLength = Math.min(minLength, (winEnd - winStart + 1));
                currentSum -= nums[winStart];
                winStart++;
            }

        }

        return minLength == Integer.MAX_VALUE? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(findMinimumSubArrayLen(nums, target));
    }
}
