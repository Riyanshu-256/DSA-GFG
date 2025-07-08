/*
Given three integers p, r and t, denoting Principal, Rate of Interest and Time period respectively. Your task is to calculate Simple Interest.
*/

package S02_Mathematics;

public class SimpleInterest {
    double simpleInterest(int P, int R, int T) {
        // code here
        double SI =(double) (P*R*T)/100.00;
        return SI;
    }
}
