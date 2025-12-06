package S04_Recursion;

public class SumOfArray {
    int arraySum(int arr[]) {
        // code here
        return arrSum(arr, arr.length);
    }

    int arrSum(int arr[], int n) {
        
        // Base case
        if (n == 0) return 0;
        return arr[n - 1] + arrSum(arr, n - 1);
    }
}
