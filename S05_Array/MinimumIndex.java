/*
Given an array arr of positive integers. You have to return the maximum of j - i such that arr[i] < arr[j] and i < j.
*/

package S05_Array;

public class MinimumIndex {
    int maxIndexDiff(int[] arr) {

        // code here
        int n = arr.length;
        if (n == 1) {
            return 0;
        }
        int maxDiff = -1;
        int[] Min = new int[n];
        int[] Max = new int[n];

        Min[0] = arr[0];
        for (int i = 1; i < n; ++i)
            Min[i] = Math.min(arr[i], Min[i - 1]);

        Max[n - 1] = arr[n - 1];
        for (int j = n - 2; j >= 0; --j)
            Max[j] = Math.max(arr[j], Max[j + 1]);

        int i = 0, j = 0;
        while (i < n && j < n) {
            if (Min[i] <= Max[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }
        return maxDiff;
    }
}
