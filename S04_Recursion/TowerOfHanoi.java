package S04_Recursion;

public class TowerOfHanoi {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        
        // code here
        if (n == 1) {
            return 1;
        }

        int moves1 = towerOfHanoi(n - 1, from, aux, to);
        int moves2 = towerOfHanoi(n - 1, aux, to, from);

        return moves1 + 1 + moves2;
    }
}
