/*
Given an positive integer n, print numbers from 1 to n without using loops.
Implement the function printTillN() to print the numbers from 1 to n as space-separated integers.
*/

package S04_Recursion;

public class Print1toNwithoutLoop {
     static void printTillN(int N) {
        // code here
        printNumbers(1, N);
    }
    
    static void printNumbers(int current, int N) {
        if (current > N) return;
        System.out.print(current + " ");
        printNumbers(current + 1, N);
    }
}
