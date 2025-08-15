package S06_Searching;

import java.util.ArrayList;

public class RemoveDuplicates {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        if(n == 0)
        return res;
        
        res.add(arr[0]);
        
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i - 1]){
                res.add(arr[i]);
            }
        }
        return res;
    }
}
