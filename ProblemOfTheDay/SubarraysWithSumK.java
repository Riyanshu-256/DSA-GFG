/*
Given an unsorted array arr[] of integers, find the number of subarrays whose sum exactly equal to a given number k.
 */
package ProblemOfTheDay;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithSumK {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // Base case: prefix sum of 0 occurs once

        int currentSum = 0;
        int count = 0;

        for (int num : arr) {
            currentSum += num;

            // Check if there's a prefix sum that when removed from currentSum gives k
            if (prefixSumCount.containsKey(currentSum - k)) {
                count += prefixSumCount.get(currentSum - k);
            }

            // Store/update current prefix sum in map
            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }
}