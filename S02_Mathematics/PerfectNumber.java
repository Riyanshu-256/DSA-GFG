/* Given a number n, check if the number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number.
*/

package S02_Mathematics;

public class PerfectNumber {
    static boolean isPerfect(int n) {
        // code here
        if (n <= 1) return false;

        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        return sum == n;
    }
}
