/* 
Given an array arr[]. Find the majority element in the array. If no majority element exists, return -1.

Note: A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.
*/

package S05_Array;

public class MajorityElement {
     int majorityElement(int arr[]) {
        int res = 0, count = 1;

        // Find a candidate
        for (int i = 1; i < arr.length; i++) {
            if (arr[res] == arr[i])
                count++;
            else
                count--;

            if (count == 0) {
                res = i;
                count = 1;
            }
        }

        // Check if the candidate is actually a majority
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[res] == arr[i])
                count++;
        }

        if (count <= arr.length / 2)
            return -1;

        return arr[res];
    }
}
