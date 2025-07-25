/*
You are given a circular array arr[] of integers, find the maximum possible sum of a non-empty subarray. In a circular array, the subarray can start at the end and wrap around to the beginning. Return the maximum non-empty subarray sum, considering both non-wrapping and wrapping cases.
*/

package ProblemOfTheDay;

public class MaxCircularSubarraySum {
    public int maxCircularSum(int arr[]) {
        // code here
        int n = arr.length;

        int maxKadane = kadane(arr);

        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];

            arr[i] = -arr[i];
        }

        int maxInverseKadane = kadane(arr);

        int maxWrap = totalSum + maxInverseKadane;

        if (maxWrap == 0)
            return maxKadane;

        return Math.max(maxKadane, maxWrap);
    }

    private int kadane(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }
}
