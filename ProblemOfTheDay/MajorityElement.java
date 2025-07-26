/*
Given an array arr[] consisting of n integers, the task is to find all the array elements which occurs more than floor(n/3) times.
Note: The returned array of majority elements should be sorted.
 */

package ProblemOfTheDay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public ArrayList<Integer> findMajority(int[] arr) {
        
        // Code here
         int n = arr.length;
        int threshold = n / 3;
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Collect elements occurring more than n/3 times
        ArrayList<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > threshold) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result); // ensure result is sorted
        return result;
    }
}
