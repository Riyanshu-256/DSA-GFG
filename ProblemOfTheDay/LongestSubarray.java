/*
Given an array arr[] and an integer k, the task is to find the length of longest subarray in which the count of elements greater than k is more than the count of elements less than or equal to k.
*/

package ProblemOfTheDay;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarray {
    public int longestSubarray(int[] arr, int k) {
        // Code Here
        int[] diff = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            diff[i] = (arr[i] > k) ? 1 : -1;
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLen = 0;
        int prefix = 0;

        for (int i = 0; i < diff.length; i++) {
            prefix += diff[i];

            if (prefix > 0) {
                maxLen = i + 1;
            } else {
                if (map.containsKey(prefix - 1)) {
                    maxLen = Math.max(maxLen, i - map.get(prefix - 1));
                }
            }

            map.putIfAbsent(prefix, i);
        }

        return maxLen;
    }
}
