package S04_Recursion;

public class GFseries {
    static void gfSeries(int N) {
        
        // code here
        int[] arr = new int[N];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < N; i++) {
            arr[i] = (arr[i - 2] * arr[i - 2]) - arr[i - 1];
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
