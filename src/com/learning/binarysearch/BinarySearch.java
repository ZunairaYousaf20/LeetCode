package com.learning.binarysearch;

public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};
        //System.out.println(linearSearch(nums, 3));

        System.out.println(binarySearch(nums, 4));
    }

    //solving with time complexity of O(logN) i.e binary search approach
    static int binarySearch(int[] nums, int target) {

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
        return -1;
    }



    //solving problem by using brute force(linear search) approach
    //time complexity of this approach is O(N)
    static int linearSearch(int[] nums, int target) {

        for (int idx = 0; idx < nums.length; idx++) {
            if(target == nums[idx]) {
                return idx;
            }
        }

        return -1;
    }
}
