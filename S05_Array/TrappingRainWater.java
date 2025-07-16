/*
Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 
*/
package S05_Array;

public class TrappingRainWater {
    public int maxWater(int[] arr) {
        
        // code here
        int n = arr.length;
        if (n <= 2) return 0;

        int res = 0;
        int[] lmax = new int[n];
        int[] rmax = new int[n];

        lmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(arr[i], lmax[i - 1]);
        }

        rmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(arr[i], rmax[i + 1]);
        }

        for (int i = 1; i < n - 1; i++) {
            res += Math.min(lmax[i], rmax[i]) - arr[i];
        }

        return res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {3, 0, 1, 0, 4, 0, 2};
        System.out.println("Total water trapped: " + sol.maxWater(arr));
    }
}
