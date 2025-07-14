package S04_Recursion;

public class NthFibonacci {
    static int fib(int N) {
        // code here
        if (N == 0)
        return 0;
        
        if (N == 1)
        return 1;

        int a = 0, b = 1;
        for (int i = 2; i <= N; i++) {
            int c = (a + b) % 10;
            a = b;
            b = c;
        }
        return b;
    }
}
