import java.util.ArrayList;

public class FibonacciToN {
     ArrayList<Integer> nFibonacci(int N) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int a = 0, b = 1;
        
        while (a <= N) {
            result.add(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
        
        return result;
    }
}
