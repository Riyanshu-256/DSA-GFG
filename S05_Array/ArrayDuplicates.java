/*
Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice, return an array of all the integers that appears twice.

Note: You can return the elements in any order but the driver code will print them in sorted order.
*/

package S05_Array;

import java.util.ArrayList;

public class ArrayDuplicates {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        int n = arr.length;
        int[] count = new int[n + 1]; 
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                result.add(i);
            }
        }

        return result;
    }
}
