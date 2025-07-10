/*
Given two positive integer n and  k, check if the kth index bit of n is set or not.
 Note: A bit is called set if it is 1. 
*/

package S03_Bit_Magic;

public class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        if((n & (1 << k)) != 0){
            return true;
        } else {
            return false;
        }
    }
}
