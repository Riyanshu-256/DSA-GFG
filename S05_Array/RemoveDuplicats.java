/*
Given a sorted array arr. Return the size of the modified array which contains only distinct elements.
Note:
1. Don't use set or HashMap to solve the problem.
2. You must return the modified array size only where distinct elements are present and modify the original array such that all the distinct elements come at the beginning of the original array.
*/

package S05_Array;

public class RemoveDuplicats {
    public int removeDuplicates(int[] arr) {
        // Code Here
        if (arr.length == 0) {
            return 0;
        }

        int res = 1;
        for (int i = 1; i < arr.length; i++) {
           
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
