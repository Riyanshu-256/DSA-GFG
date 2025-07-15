/*
Given an array arr[]. The task is to find the largest element and return it.
 */

package S05_Array;

public class Largest {
    public static int largest(int[] arr) {
        
        // code here
        int largestValue = arr[0]; 

        for(int i = 1; i < arr.length; i++) { 
            if(arr[i] > largestValue) {
                largestValue = arr[i]; 
            }
        }
        return largestValue; 
    }
}