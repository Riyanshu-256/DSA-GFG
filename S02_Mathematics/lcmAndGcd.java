/* 
Given two integers a and b, You have to compute their LCM and GCD and return an array containing their LCM and GCD.
*/

/*
class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        
        if(b == 0)
        return a;
        return Gcd(b, a%b);
    }
    int lcm (int a, int b){
        return (a*b) / gcd(a,b);
    }
}
*/

package S02_Mathematics;

public class lcmAndGcd {

    public static int[] lcmAndGcd(int a, int b) {
        int gcdValue = gcd(a, b);
        int lcmValue = (a * b) / gcdValue;
        return new int[]{lcmValue, gcdValue};  // returning int[]
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}


