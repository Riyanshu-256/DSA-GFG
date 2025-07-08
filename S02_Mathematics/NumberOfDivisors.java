//Given an integer n, find the number of divisors of n that are divisible by 3

package S02_Mathematics;

public class NumberOfDivisors {
    static int countDivisors(int n) {
        // code here
        int count = 0; 
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i % 3 == 0) {
                    count++; 
                }
            }
        }
        return count; 
    }
}