// Given a number n, find the nth term in the series 1, 3, 6, 10, 15, 21…

package S02_Mathematics;

public class nth_2_TermOfSeries {
    static int findNthTerm(int n) {
        // code here
        int nthTerm = (n * (n + 1)) / 2;
        return nthTerm;
    }
}