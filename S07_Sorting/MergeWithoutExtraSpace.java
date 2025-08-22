package S07_Sorting;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int i = a.length - 1, j = 0;
        
        while(i  >= 0 && j < b.length){
            if(a[i] < b[j])
            i--;
            else {
                int temp = b[j];
                b[j] = a[i];
                a[i] = temp;
                i--;
                j++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
