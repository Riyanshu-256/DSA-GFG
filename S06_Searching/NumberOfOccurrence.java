package S06_Searching;

public class NumberOfOccurrence {
    int countFreq(int[] arr, int target) {
        // code here
        int n = arr.length; 
        int first = firstOccur(arr, n, target);
        if (first == -1)
            return 0;
        else
            return (lastOccur(arr, n, target) - first + 1);
    }
    int firstOccur(int[] arr, int n, int target) {
        int low = 0, high = n - 1, res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                res = mid;
                high = mid - 1; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
    int lastOccur(int[] arr, int n, int target) {
        int low = 0, high = n - 1, res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                res = mid;
                low = mid + 1; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
}
