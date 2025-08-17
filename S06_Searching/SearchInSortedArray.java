package S06_Searching;

public class SearchInSortedArray {
    public int findTarget(int arr[], int target) {
        // code here
        int n = arr.length;
        
        // binary search
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // if target found at mid
            if (arr[mid] == target) {
                return mid;
            }
            
            // if target found at mid - 1
            if (mid - 1 >= low && arr[mid - 1] == target) {
                return mid - 1;
            }

            // if target found at mid + 1
            if (mid + 1 <= high && arr[mid + 1] == target) {
                return mid + 1;
            }

            if (target < arr[mid]) {   // if target is smaller than arr[mid]
                high = mid - 2;
            } else {
                low = mid + 2;
            }
        }

        return -1;
    }
}
