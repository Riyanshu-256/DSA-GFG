package ProblemOfTheDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class WindowSize {
    public ArrayList<Integer> maxOfMins(int[] arr) {
        int n = arr.length;

        // Arrays to store previous and next smaller
        int[] left = new int[n];  // previous smaller
        int[] right = new int[n]; // next smaller
        Arrays.fill(left, -1);
        Arrays.fill(right, n);

        Stack<Integer> st = new Stack<>();

        // Fill previous smaller (left)
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (!st.isEmpty()) left[i] = st.peek();
            st.push(i);
        }

        // Clear stack for next smaller
        st.clear();

        // Fill next smaller (right)
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (!st.isEmpty()) right[i] = st.peek();
            st.push(i);
        }

        // Result array (for window sizes 1..n)
        int[] res = new int[n + 1];

        // Find length of window where arr[i] is minimum
        for (int i = 0; i < n; i++) {
            int len = right[i] - left[i] - 1;
            res[len] = Math.max(res[len], arr[i]);
        }

        // Fill remaining values
        for (int i = n - 1; i >= 1; i--) {
            res[i] = Math.max(res[i], res[i + 1]);
        }

        // Convert to ArrayList
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) ans.add(res[i]);

        return ans;
    }
}