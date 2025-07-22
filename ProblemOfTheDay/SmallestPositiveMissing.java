package ProblemOfTheDay;

public class SmallestPositiveMissing {
    
    public int missingNumber(int[] arr) {
        
        // code here
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            while(arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]){
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        
        for(int i=0; i<n; i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return n + 1;
    }
    
}
