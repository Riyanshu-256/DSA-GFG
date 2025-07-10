/*
Given an integer n. You have to return the position of the first set bit  from the right side in the binary representation of the number. If there is no set bit in the integer N, then return 0 from the function.  Given an integer n. You have to return the position of the first set bit  from the right side in the binary representation of the number. If there is no set bit in the integer N, then return 0 from the function.  
*/

package S03_Bit_Magic;

public class FirstSetBit {
    public static int getFirstSetBit(int n) {
        // code here
        if (n == 0) return 0;
        int setAt = 1;
        while ((n & 1) == 0) {
            n = n >> 1;
            setAt++;
        }
        return setAt;
    }
}
