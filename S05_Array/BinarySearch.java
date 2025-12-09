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
