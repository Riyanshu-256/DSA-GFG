package S06_Searching;

public class IndexOfExtraElement {
    public int findExtra(int arr1[], int arr2[]) {
        // add code here.
        int n = arr2.length;
        
        int low = 0, high = n - 1;
        int res = n;
        
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr1[mid] == arr2[mid]){
                low = mid + 1;
            } else {
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }
}
