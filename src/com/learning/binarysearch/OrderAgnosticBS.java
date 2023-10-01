package com.learning.binarysearch;

public class OrderAgnosticBS {

    public static void main(String[] args) {

        //int[] arr = {40, 35, 30, 25, 20, 15, 10, 5, 3, 2, 1};
        int[] arr = {1, 2, 3, 5, 10, 15, 20, 25, 30, 35, 40};
        System.out.println(BinarySearch(arr, -10));

    }

    static int BinarySearch(int[] arr, int target) {

        if(arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        boolean isOrderAgnostic = arr[start] > arr[end];

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(target == arr[mid]) {
                return mid;
            }

            if(isOrderAgnostic) {
                //searching element in descending order
                if(target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            } else {
                //searching element in ascending order
                if(target < arr[mid]) {
                    end = mid - 1;
                } else if(target > arr[mid]) {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
