package ProblemOfTheDay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AbsoluteDifference {
    public void rearrange(int[] arr, int x) {
        // code here
         // Create a list of elements with their original indices
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(new int[]{arr[i], i}); // store element and original index
        }

        // Sort the list based on absolute difference, with stable tie-breaking
        Collections.sort(list, (a, b) -> {
            int diffA = Math.abs(a[0] - x);
            int diffB = Math.abs(b[0] - x);
            if (diffA != diffB) {
                return diffA - diffB;
            } else {
                return a[1] - b[1]; // maintain original order if differences are equal
            }
        });

        // Copy sorted elements back to the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i)[0];
        }
    }
}
