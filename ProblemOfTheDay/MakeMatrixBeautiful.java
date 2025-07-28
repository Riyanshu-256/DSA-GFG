/*
A beautiful matrix is defined as a square matrix in which the sum of elements in every row and every column is equal. Given a square matrix mat[][], your task is to determine the minimum number of operations required to make the matrix beautiful.
In one operation, you are allowed to increment the value of any single cell by 1.
 */

package ProblemOfTheDay;

public class MakeMatrixBeautiful {
    public static int balanceSums(int[][] mat) {
        
        // code here
        int n = mat.length;
        int[] rowSum = new int[n];
        int[] colSum = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += mat[i][j];
                colSum[j] += mat[i][j];
            }
        }
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, rowSum[i]);
            maxSum = Math.max(maxSum, colSum[i]);
        }
        int operations = 0;
        int i = 0, j = 0;

        while (i < n && j < n) {
            int diff = Math.min(maxSum - rowSum[i], maxSum - colSum[j]);
            mat[i][j] += diff;
            rowSum[i] += diff;
            colSum[j] += diff;
            operations += diff;

            if (rowSum[i] == maxSum) i++;
            if (colSum[j] == maxSum) j++;
        }
        return operations;
    }
}

