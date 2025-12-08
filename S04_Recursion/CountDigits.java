public class CountDigits {
    public static int countDigits(int n) {
        // Code here
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        return 1 + countDigits(n/10);
    
    }
}
