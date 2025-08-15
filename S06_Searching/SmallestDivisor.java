package S06_Searching;

public class SmallestDivisor {
    int smallestDiv(int[] arr, int div) {
        // code here
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (arr[i] + div - 1) / div;
        }
        return sum;
    }

    int smallestDivisor(int[] arr, int k) {
        int low = 1, high = 0;

        for (int num : arr) {
            high = Math.max(high, num);
        }

        int ans = high; 

        while (low <= high) {
            int mid = (low + high) / 2;

            if (smallestDiv(arr, mid) <= k) {
                ans = mid;      
                high = mid - 1; 
            } else {
                low = mid + 1;  
            }
        }
        return ans;
    }
}
