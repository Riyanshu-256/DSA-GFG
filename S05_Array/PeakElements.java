public class PeakElements {
    public int peakElement(int[] arr) {
        // code here
        int n = arr.length;
        
        // If array contain only one element
        if(n == 1) return 0;
        
        // If 1st element is greater than 2nd element
        if(arr[0] >= arr[1]) return 0;
        
        // Check for middle element
        for(int i=1; i<n-1; i++){
            if((arr[i] >= arr[i-1]) && (arr[i] >= arr[i+1]))
        return i;
        }
        
        // If last element is greater than the previous element
        if(arr[n-1] >= arr[n-2]){
            return n-1;
        }
        
        // If peak element not found
        return -1;
    }
}
