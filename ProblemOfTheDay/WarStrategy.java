package ProblemOfTheDay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WarStrategy {
    public int minSoldiers(int[] arr, int k) {
        // code here
         int n = arr.length;
        int luckyCount = 0;
        List<Integer> additions = new ArrayList<>();
        
        for (int soldiers : arr) {
            if (soldiers % k == 0) {
                luckyCount++;
            } else {
                additions.add(k - (soldiers % k));
            }
        }
        
        int needed = (n + 1) / 2 - luckyCount; // ceil(n/2) = (n+1)/2
        if (needed <= 0) return 0;
        
        Collections.sort(additions);
        int totalAdd = 0;
        for (int i = 0; i < needed && i < additions.size(); i++) {
            totalAdd += additions.get(i);
        }
        
        return totalAdd;
    }
}
