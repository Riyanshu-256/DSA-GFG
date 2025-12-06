package S04_Recursion;

public class PowerOfNumbers {
    public int reverseExponentiation(int n) {

        int temp = n;
        int rev = 0;

        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        return power(n, rev);
    }

    private int power(int base, int exp) {
        int result = 1;

        while (exp > 0) {
            if (exp % 2 != 0) {
                result *= base;
            }
            base *= base;
            exp = exp / 2;
        }

        return result;
    }
}
