/*
You are given a 2D integer array intervals[][] of length n, where each intervals[i] = [start, end] represents a closed interval (i.e., all integers from start to end, inclusive). You are also given an integer k. An integer is called Powerful if it appears in at least k intervals. Find the maximum Powerful Integer.

Note: If no integer occurs at least k times return -1.
 */

package ProblemOfTheDay;

import java.util.Map;
import java.util.TreeMap;

public class Powerfull_Integer {
    public int powerfulInteger(int[][] intervals, int k) {
        // code here
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Build the difference map for prefix sum approach
        for (int[] interval : intervals) {
            map.put(interval[0], map.getOrDefault(interval[0], 0) + 1);
            map.put(interval[1] + 1, map.getOrDefault(interval[1] + 1, 0) - 1);
        }

        int count = 0;
        int result = -1;
        int prev = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int point = entry.getKey();

            // If previous point was powerful, update result to the end of that segment
            if (count >= k && prev != -1) {
                result = point - 1;
            }

            count += entry.getValue();
            prev = point;
        }

        return result;
    }
}
