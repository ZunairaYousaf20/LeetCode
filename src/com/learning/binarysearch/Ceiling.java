package com.learning.binarysearch;

public class Ceiling {

    public static void main(String[] args) {

        //Ceiling -> The Smallest element greater than or equal to target
        int[] nums = {2, 3, 5, 9, 14, 16, 18, 20, 25};
        System.out.println(ceiling(nums, 20));
    }

    static int ceiling(int[] nums, int target) {

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
                //found target element
                return mid;
            }
        }

        //if element does not exist then return -1
        return start;
    }

}
