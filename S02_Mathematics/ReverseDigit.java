/*
You are given an integer n. Your task is to reverse the digits, ensuring that the reversed number has no leading zeroes
 */

package S02_Mathematics;

public class ReverseDigit {
    public int reverseDigits(int n) {
        // Code here
        int rev = 0;
        int temp = n;
        while(temp!= 0){
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp / 10;
        } 
        return rev;
    }
}
