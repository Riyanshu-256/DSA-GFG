//You are given an array of integers arr[]. Your task is to reverse the given array.

package S05_Array;
public class Reverse {
     public void reverseArray(int arr[]) {
        // code here
        int low = 0, high =arr.length -1; 
        while(low<high){
            int temp = arr [low];
            arr[low] = arr [high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
