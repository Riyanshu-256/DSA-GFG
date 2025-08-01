/*
Given a array arr of integers, return the sums of all subsets in the list.  Return the sums in any order.
 */

package S04_Recursion;

import java.util.ArrayList;

public class SubsetSum {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        subsetSums(arr, 0, 0, result);
        return result;
    }

    private void subsetSums(int[] arr, int index, int currentSum, ArrayList<Integer> result) {
        if (index == arr.length) {
            result.add(currentSum);
            return;
        }

        // Include the current element
        subsetSums(arr, index + 1, currentSum + arr[index], result);

        // Exclude the current element
        subsetSums(arr, index + 1, currentSum, result);
    }
}
