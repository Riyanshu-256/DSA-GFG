package ProblemOfTheDay;

import java.util.ArrayList;
import java.util.Collections;

public class FarthestSmallerRight {
    public ArrayList<Integer> farMin(int[] arr) {
        // Code Here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, -1));
        ArrayList<Integer> arrList = new ArrayList<>(n);
        for (int i : arr) arrList.add(i);

        // build suffix min array
        ArrayList<Integer> suff = new ArrayList<>(arrList);
        suff.set(n - 1, arrList.get(n - 1));
        for (int i = n - 2; i >= 0; --i)
            suff.set(i, Math.min(arrList.get(i), suff.get(i + 1)));

        // binary search on suffix for farthest smaller element
        for (int i = 0; i < n; ++i) {
            int lo = i + 1, hi = n - 1, res = -1;

            while (lo <= hi) {
                int mid = (lo + hi) / 2;
                if (suff.get(mid) < arrList.get(i)) {
                    res = mid;
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }

            ans.set(i, res);
        }

        return ans;
    }
}
