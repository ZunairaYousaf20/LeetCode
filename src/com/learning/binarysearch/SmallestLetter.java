package com.learning.binarysearch;

public class SmallestLetter {

    public static void main(String[] args) {

        char[] letters = {'c', 'd', 'f', 'g', 'k'};
        System.out.println(nextGreatestElement(letters, 'm'));
    }

    static char nextGreatestElement(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            //find the middle element
            int mid = start + (end - start)/2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }

}
