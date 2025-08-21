package S07_Sorting;

public class SelectionSort {
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_ind = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_ind]) {
                    min_ind = j;
                }
            }
            // Swap arr[min_ind] and arr[i]
            int temp = arr[min_ind];
            arr[min_ind] = arr[i];
            arr[i] = temp;
        }
    }
}
