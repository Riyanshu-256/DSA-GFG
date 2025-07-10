/*
Given a non-negative integer n. You have to check if it is a power of 2 or not.
*/

package S03_Bit_Magic;

public class PowerOfTwo {
    public static boolean isPowerofTwo(int n) {
        // code here
        if(n <= 0){
            return false;
        } else {
            return (n & (n-1)) == 0;
        }
    }
}
