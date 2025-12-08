public class PowerUsingRecursion {
    static int RecursivePower(int n, int p) {
        // Code here
        if(p == 0) return 1;
        if(n == 1) return 1;
        
        return n * RecursivePower(n, p-1);
    }
}
