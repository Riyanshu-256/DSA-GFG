/*
Given a positive integer n. Your task is to return the count of set bits.
*/

package S03_Bit_Magic;

public class CountBit {
    static int setBits(int n) {
        // code here
        int count = Integer.bitCount(n);
        return count;
    }
}
