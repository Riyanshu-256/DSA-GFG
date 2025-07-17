package S05_Array;

public class PeakElement {
    public int peakElement(int[] arr) {
        // code here
        int n = arr.length;
        if (n == 1) return 0;
        for (int i=0; i<n; i++) {
            if (i==0 && arr[i]>arr[i+1]) {
                return i;
            }
            else if (i==n - 1 && arr[i]>arr[i-1]) {
                return i;
            }
            else if (i>0 && i < n-1 && arr[i]>arr[i-1] && arr[i] > arr[i+1]){
                return i;
            }
        }
        return -1;
    }
}
