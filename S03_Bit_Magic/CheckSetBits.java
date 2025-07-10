/*
Given a number N. You have to check whether every bit in the binary representation of the given number is set or not.
*/

package S03_Bit_Magic;

public class CheckSetBits {
    static int isBitSet(int N) {
        // code here
        if(N == 0){
            return 0;
        }
        
        if((N & (N + 1)) == 0){
            return 1;
        } else {
            return 0;
        }
    }
}
