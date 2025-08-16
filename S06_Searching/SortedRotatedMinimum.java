package S06_Searching;

public class SortedRotatedMinimum {
    public int findMin(int[] arr) {
        // complete the function here
        int n = arr.length;
        int low = 0, high = n - 1;

        if (arr[low] <= arr[high]) {
            return arr[low];
        }

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] <= arr[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return arr[low];
    }
}
