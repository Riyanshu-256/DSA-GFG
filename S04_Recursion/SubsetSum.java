/*
Given a array arr of integers, return the sums of all subsets in the list.  Return the sums in any order.
 */

package S04_Recursion;

public class SubsetSum {
    static Boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;
        Boolean[][] dp = new Boolean[n + 1][sum + 1];
        return helper(arr, n, sum, dp);
    }

    static Boolean helper(int[] arr, int n, int sum, Boolean[][] dp) {

        // base conditions
        if (sum == 0) return true;
        if (n == 0) return false;

        if (dp[n][sum] != null) return dp[n][sum];

        // skip the element if it is larger
        if (arr[n - 1] > sum)
            return dp[n][sum] = helper(arr, n - 1, sum, dp);

        return dp[n][sum] =
                helper(arr, n - 1, sum, dp) ||
                helper(arr, n - 1, sum - arr[n - 1], dp);
    }
}
