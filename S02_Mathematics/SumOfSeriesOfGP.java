/*
Given n, a and r as the number of terms, first term and common ratio respectively of an Geometric Progression Series. Find the sum of the series upto nth term.
*/

package S02_Mathematics;

public class SumOfSeriesOfGP {
    public long sum_of_gp(long n, long a, long r) {
        // Code here
        if (r == 1) {
            return n * a;
        } else {
            // Calculate r^n
            long r_power_n = 1;
            for (int i = 0; i < n; i++) {
                r_power_n *= r;
            }
            return a * (r_power_n - 1) / (r - 1);
        }
    }
}
