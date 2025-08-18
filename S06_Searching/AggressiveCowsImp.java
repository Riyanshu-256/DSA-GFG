package S06_Searching;

import java.util.Arrays;

public class AggressiveCowsImp {
    public int aggressiveCows(int[] stalls, int k) {
        // Sort the stall positions
        Arrays.sort(stalls);
        int n = stalls.length;
        
        // Possible distance
        int low = 1;                          // minimum distance possible between two cows
        int high = stalls[n - 1] - stalls[0]; // maximum distance possible between two cows
        int answer = 0;

        // Binary search 
        while (low <= high) {
            int mid = (low + high) / 2; 

            // To check if we can place given all cows with mid distance
            if (canPlace(stalls, k, mid)) {
                answer = mid;      // if this distance possible, store it
                low = mid + 1;     // try for bigger distance
            } else {
                high = mid - 1;    // if not, try smaller distance
            }
        }

        return answer;
    }

    private boolean canPlace(int[] stalls, int k, int dist) {
        int count = 1;                // place first cow at first stall
        int lastPosition = stalls[0];  // last placed position of cow

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= dist) {
                count++;              // place another cow 
                lastPosition = stalls[i];
            }
            if (count == k) return true; // successfully placed all cows
        }
        return false;                 // not possible this distance for all cows
    }
}
