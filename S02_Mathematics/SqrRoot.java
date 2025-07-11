/* Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value.
Floor value of any number is the greatest Integer which is less than or equal to that number
*/
package S02_Mathematics;

public class SqrRoot {
    int floorSqrt(int n) {
        // code here
        double sqrRoot = Math.sqrt (n);
        return (int) Math.floor(sqrRoot);
    }
}
