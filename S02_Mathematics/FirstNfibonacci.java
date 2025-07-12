/*
Given a number n, return an array containing the first n Fibonacci numbers.
Note: The first two numbers of the series are 0 and 1.
*/

package S02_Mathematics;

public class FirstNfibonacci {
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
