/*
Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.

Note: If no such array is possible then, return [-1].
*/
package S05_Array;

import java.util.ArrayList;

public class IndexesOfSubarraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int start = 0;
        int sum = 0;
        
        for(int end = 0; end < n; end++){
            sum += arr[end];
            
            while(sum > target && start <= end){
                sum -= arr[start];
                start++;
            }
            
            if (sum == target) {
                result.add(start + 1); 
                result.add(end + 1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }
}
