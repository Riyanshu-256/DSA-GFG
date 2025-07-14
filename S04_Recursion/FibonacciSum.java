package S04_Recursion;

public class FibonacciSum {
    static long fibSum(long N) {
        
        // code here
        int mod = 1000000007;

        // First two Fibonacci numbers
        long a = 0;
        long b = 1;

        // Sum starts with f0 + f1
        long sum = a + b;

        if (N == 0) return a;
        if (N == 1) return sum % mod;

        for (int i = 2; i <= N; i++) {
            long c = (a + b) % mod;
            sum = (sum + c) % mod;
            a = b;
            b = c;
        }

        return sum % mod;
    }
}
