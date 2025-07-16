/*
Given an array arr[]. The task is to rotate the array by d elements where d ≤ arr.size.
*/

package S05_Array;

public class RotatingArray {
    void leftRotate(int arr[], int d) {
        // code here
        int n = arr.length;
        d = d % n;  // In case d > n

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
