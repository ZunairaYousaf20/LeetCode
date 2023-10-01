package com.learning.binarysearch;

public class Floor {

    public static void main(String[] args) {

        //Floor -> The Biggest element smaller than or equal to target
        int[] nums = {2, 3, 5, 9, 14, 16, 18, 20, 25};
        System.out.println(floor(nums, 16));
    }

    static int floor(int[] nums, int target) {

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
        return end;
    }

}
