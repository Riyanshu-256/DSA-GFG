package S04_Recursion;

public class First_n_Fibonacci {
    public static int[] fibonacciNumbers(int n) {
        // Your code here
         int[] fib = new int[n];
        
        if (n >= 1) fib[0] = 0;
        if (n >= 2) fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib;
    }
}
