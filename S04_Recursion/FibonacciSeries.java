public class FibonacciSeries {
    static final int MOD = 1000000007;

    int[] Series(int n) {

        int[] fib = new int[n + 1];

        // base cases
        if (n >= 0) fib[0] = 0;
        if (n >= 1) fib[1] = 1;

        // build fibonacci till n
        for (int i = 2; i <= n; i++) {
            fib[i] = (int)(((long)fib[i - 1] + fib[i - 2]) % MOD);  
        }

        return fib;
    }
}
