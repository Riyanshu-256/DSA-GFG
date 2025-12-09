/*
Given a sorted array arr[] and an integer k, find the position(0-based indexing) at which k is present in the array using binary search. If k doesn't exist in arr[] return -1. 
*/

public class BinarySearch {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == k) return i;
        }
        return -1;
    }
}
