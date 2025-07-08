/* Given a number n, determine whether it is a prime number or not.
Note: A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.
*/

package S02_Mathematics;

public class PrimeNumber {

    static boolean isPrime(int n) {
        // code here
        if(n == 1)
        return false;
            
        for (int i = 2; i*i <= n; i++){
            if (n%i == 0)
            return false;
        }
        return true;
    }
}
