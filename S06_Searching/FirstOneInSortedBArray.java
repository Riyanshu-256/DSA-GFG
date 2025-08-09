package S06_Searching;

public class FirstOneInSortedBArray {
    public long firstIndex(int arr[]) {
        // Your code goes hereclass Solution 
        int low = 0, high = arr.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] == 0) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] == 0) {
                    return mid; // Found the first 1
                } else {
                    high = mid - 1;
                }
            }
        }
        
        return -1; 
    }
}
