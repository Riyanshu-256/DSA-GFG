/*
Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
Note: The second largest element should not be equal to the largest element.

*/

public class SecondLargestElement {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;

        if(n < 2) return -1;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }

        if(secondLargest == Integer.MIN_VALUE)
            return -1;

        return secondLargest;
    }
}
