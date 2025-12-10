public class CountZero {
    int countZeroes(int[] arr) {
        // code here
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }

        return count;
    }
}
