/*
Given an array arr[] of time strings in 24-hour clock format "HH:MM:SS", return the minimum difference in seconds between any two time strings in the arr[].
The clock wraps around at midnight, so the time difference between "23:59:59" and "00:00:00" is 1 second.
*/

package ProblemOfTheDay;

import java.util.Arrays;

public class DiffereceCheck {
    public int minDifference(String[] arr) {
        // code here
        int n = arr.length;
        int[] seconds = new int[n];

        // Convert each time string to total seconds
        for (int i = 0; i < n; i++) {
            String[] parts = arr[i].split(":");
            int h = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            int s = Integer.parseInt(parts[2]);
            seconds[i] = h * 3600 + m * 60 + s;
        }

        // Sort the times in seconds
        Arrays.sort(seconds);

        int minDiff = Integer.MAX_VALUE;

        // Compare each adjacent pair
        for (int i = 1; i < n; i++) {
            minDiff = Math.min(minDiff, seconds[i] - seconds[i - 1]);
        }

        // Handle circular case (wrap around midnight)
        int wrapAroundDiff = 86400 - seconds[n - 1] + seconds[0]; // 86400 = 24*3600
        minDiff = Math.min(minDiff, wrapAroundDiff);

        return minDiff;
    }
}
