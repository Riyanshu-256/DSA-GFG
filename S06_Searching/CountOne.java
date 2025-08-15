package S06_Searching;

public class CountOne {
    public int countOnes(int[] arr) {
        int n = arr.length; 
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == 0) {
                high = mid - 1;
            } else {
                if (mid == n - 1 || arr[mid + 1] == 0) {
                    return mid + 1; 
                }
                low = mid + 1;
            }
        }

        return 0;
    }
}
