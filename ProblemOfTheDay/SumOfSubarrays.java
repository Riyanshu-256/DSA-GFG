/* 
Given an array arr[], find the sum of all the subarrays of the given array.

Note: It is guaranteed that the total sum will fit within a 32-bit integer range.
*/

package ProblemOfTheDay;

public class SumOfSubarrays {
    public int subarraySum(int[] arr) {
        // code here
        int n = arr.length;
        long totalSum = 0;
        
        for(int i=0; i<n; i++){
            long count = (long)(i+1) * (n-i);
            totalSum += arr[i] * count;
        }
        return (int) totalSum;
    }
}
