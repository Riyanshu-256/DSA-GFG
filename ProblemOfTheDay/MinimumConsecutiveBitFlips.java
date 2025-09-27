package ProblemOfTheDay;

public class MinimumConsecutiveBitFlips {
    public int kBitFlips(int[] arr, int k) {
        int n = arr.length;
        int flips = 0; // total flips count
        int currFlip = 0; // current flip effect
        int[] isFlipped = new int[n]; // to mark flip start
        
        for (int i = 0; i < n; i++) {
            if (i >= k) {
                currFlip ^= isFlipped[i - k]; // remove expired flip effect
            }
            
            // If after flips, arr[i] is 0, we must flip here
            if ((arr[i] ^ currFlip) == 0) {
                if (i + k > n) return -1; // not enough space to flip
                flips++;
                currFlip ^= 1; // new flip starts
                isFlipped[i] = 1;
            }
        }
        
        return flips;
    }
}
