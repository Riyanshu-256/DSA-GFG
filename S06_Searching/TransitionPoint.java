package S06_Searching;

public class TransitionPoint {
    int transitionPoint(int arr[]) {
        // code here
        int n = arr.length;
        int low = 0, high = n - 1;
        int res = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            
            if(arr[mid] == 1){
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}
