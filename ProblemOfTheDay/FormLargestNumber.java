package ProblemOfTheDay;

import java.util.Arrays;

public class FormLargestNumber {
    public String findLargest(int[] arr) {
        // code here
        String[] nums = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = String.valueOf(arr[i]);
        }

        // Custom comparator: sort based on (a+b) vs (b+a)
        Arrays.sort(nums, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: if the largest number is "0", return just "0"
        if (nums[0].equals("0")) return "0";

        // Build the result
        StringBuilder result = new StringBuilder();
        for (String num : nums) {
            result.append(num);
        }

        return result.toString();
    }
}
