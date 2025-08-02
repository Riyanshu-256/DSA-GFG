/*
You are given an integer array arr[]. The task is to find the sum of it
*/
package S05_Array;

public class SumOfArray {
    int arraySum(int arr[]) {
        // code here
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        return sum;
    }
}
