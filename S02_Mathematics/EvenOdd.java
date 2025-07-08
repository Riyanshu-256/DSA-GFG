/* 
Given a positive integer n, determine whether it is odd or even. Return true if the number is even and false if the number is odd.
*/

package S02_Mathematics;

public class EvenOdd {
    static boolean isEven(int n) {
        // code here
        if (n % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
