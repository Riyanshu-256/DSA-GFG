package ProblemOfTheDay;

import java.util.Stack;

public class MaxRectangle {
        static int getMaxArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        int res = 0;
        int tp, curr;

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {

                tp = s.pop();

                int width = s.isEmpty() ? i : i - s.peek() - 1;

                res = Math.max(res, arr[tp] * width);
            }
            s.push(i);
        }

        while (!s.isEmpty()) {
            tp = s.pop();
            curr = arr[tp] * (s.isEmpty() ? n : n - s.peek() - 1);
            res = Math.max(res, curr);
        }

        return res;
    }

    static int maxArea(int[][] mat) {
        int n = mat.length, m = mat[0].length;

        int[] arr = new int[m];

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    arr[j]++;
                } else {
                    arr[j] = 0;
                }
            }

            ans = Math.max(ans, getMaxArea(arr));
        }

        return ans;
    }
}
