/*
You are given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak if it is greater than its adjacent elements (if they exist).
If there are multiple peak elements, Return index of any one of them. The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".
Note: Consider the element before the first element and the element after the last element to be negative infinity.
*/

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
