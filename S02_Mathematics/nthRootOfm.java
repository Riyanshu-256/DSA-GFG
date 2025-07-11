/*
You are given 2 numbers n and m, the task is to find n√m (nth root of m). If the root is not integer then returns -1.
*/

package S02_Mathematics;

public class nthRootOfm {
    public int nthRoot(int n, int m) {
        // code here
        for (int i = 1; i <= m; i++) {
            long power = 1;
            for (int j = 1; j <= n; j++) {
                power = power * i;
            }

            if (power == m) {
                return i;
            } else if (power > m) {
                break;
            }
        }
        return -1;
    }
}
