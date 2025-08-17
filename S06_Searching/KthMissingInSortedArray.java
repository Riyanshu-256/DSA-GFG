package S06_Searching;

public class KthMissingInSortedArray {
     public int kthMissing(int[] arr, int k) {
        // code here
        int n = arr.length;
        int low = 0, high = n - 1;

        // Binary search
        while (low <= high) {
            int mid = (low + high) / 2;
            
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1; // kth missing is on right
            } else {
                high = mid - 1; // kth missing is on left
            }
        }
        return low + k;
    }
}
