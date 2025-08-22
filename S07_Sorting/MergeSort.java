package S07_Sorting;

public class MergeSort {
    void mergeSort(int arr[], int l, int r) {
        // code here
        if (l < r) {
            int m = l + (r - l) / 2;

            // Sort left half
            mergeSort(arr, l, m);
            // Sort right half
            mergeSort(arr, m + 1, r);
            // Merge the two halves
            merge(arr, l, m, r);
        }
    }

    // Function to merge two sorted halves
    void merge(int arr[], int l, int m, int r) {
        // Sizes of two subarrays
        int n1 = m - l + 1;
        int n2 = r - m;

        // Temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data into temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        // Merge temp arrays back into arr[l..r]
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
