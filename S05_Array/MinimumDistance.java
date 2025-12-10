public class MinimumDistance {
    int minDist(int arr[], int x, int y) {
        // code here
        int n = arr.length;
        int last = -1;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x || arr[i] == y) {

                if (last != -1 && arr[last] != arr[i]) {
                    ans = Math.min(ans, i - last);
                }
                last = i;
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
