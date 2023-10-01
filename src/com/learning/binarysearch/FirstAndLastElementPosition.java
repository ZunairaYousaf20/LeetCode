package com.learning.binarysearch;

import java.util.Arrays;

public class FirstAndLastElementPosition {

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));

    }

    static int[] searchRange(int[] nums, int target) {

        if(nums.length == 0) {
            return new int[] {-1, -1};
        }

        int firstPos = search(nums, target, true);
        int lastPos = search(nums, target, false);

        return new int[] {firstPos, lastPos};
    }

    static int search(int[] nums, int target, boolean firstIndexOccurrence) {

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            //find the middle element
            int mid = start + (end - start)/2;

            if(target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                if(firstIndexOccurrence) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                ans = mid;
            }
        }

        return ans;
    }
}
