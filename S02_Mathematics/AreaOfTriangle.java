package S02_Mathematics;

public class AreaOfTriangle {
    double findArea(int A, int B, int C) {
        // code here
        if ((A+B>C) && (A+C>B) && (B+C> A) ) {  // sum of two sides must be greater than other third side
            double S = (double) (A+B+C ) / 2.0;
            double area = Math.sqrt(S*(S-A)*(S-B)*(S-C));
            return area;
        } else {
            return 0.0;
        }
    }
}
