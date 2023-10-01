package com.learning.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LargestSubStringLength {

    static int findLargestSubStringLen(String str, int k) {

        int maxLength = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            while (map.size() > k) {
                char leftChar = str.charAt(windowStart);
                map.put(leftChar, map.get(leftChar) - 1);

                if(map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                windowStart++;
            }

            if(map.size() == k) {
                maxLength = Math.max(maxLength, (windowEnd - windowStart + 1));
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String str = "aabacbebebe";
        int k = 3;

        System.out.println(findLargestSubStringLen(str, k));
    }
}
