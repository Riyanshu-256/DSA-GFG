public class GfgNtimes {
    void printGfg(int N) {
        // base case
        if (N == 0) return;
        System.out.print("GFG ");

        printGfg(N-1);
    }
}
