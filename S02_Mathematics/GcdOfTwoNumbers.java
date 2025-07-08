/* Given two positive integers a and b, find GCD of a and b.
Note: Don't use the inbuilt gcd function
*/

package S02_Mathematics;

public class GcdOfTwoNumbers {

    public static int gcd(int a, int b) {
        // code here
       while ( a != b)
       if(a > b){
       a = a-b;
       } else {
           b = b-a;
       }
       return a;
    }
}
