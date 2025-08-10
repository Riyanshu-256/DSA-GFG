package S06_Searching;

import java.util.ArrayList;

public class FirstAndLastOccurrences {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;

        int first = firstOcc(arr, 0, n - 1, x);
        int last = lastOcc(arr, 0, n - 1, x);

        ans.add(first);
        ans.add(last);
        return ans;
    }
    int firstOcc(int arr[], int low, int high, int x) {
        int res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                res = mid;
                high = mid - 1; 
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
    int lastOcc(int arr[], int low, int high, int x) {
        int res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                res = mid;
                low = mid + 1; 
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
        
    }
}
