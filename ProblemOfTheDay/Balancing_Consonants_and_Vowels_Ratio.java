/*
You are given an array of strings arr[], where each arr[i] consists of lowercase english alphabets. You need to find the number of balanced strings in arr[] which can be formed by concatinating one or more contiguous strings of arr[].
A balanced string contains the equal number of vowels and consonants. 
 */

package ProblemOfTheDay;

import java.util.HashMap;

public class Balancing_Consonants_and_Vowels_Ratio {
    public int countBalanced(String[] arr) {
        // code here
        HashMap<Integer, Integer> balanceCount = new HashMap<>();
        balanceCount.put(0, 1); // base case: empty prefix is balanced

        int balance = 0;
        int result = 0;

        for (String s : arr) {
            for (char c : s.toCharArray()) {
                if (isVowel(c)) balance++;
                else balance--;
            }

            // If this balance has been seen before, we found that many balanced substrings
            result += balanceCount.getOrDefault(balance, 0);

            // Update frequency of current balance
            balanceCount.put(balance, balanceCount.getOrDefault(balance, 0) + 1);
        }

        return result;
    }

    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
