/*
You are given an integer n. Your task is to determine whether it is a palindrome.

A number is considered a palindrome if it reads the same backward as forward, like the string examples "MADAM" or "MOM".
*/

package S04_Recursion;

public class Palindrome {
    public boolean isPalindrome(int n) {
        // code here
        String str = String.valueOf(n);
        return isPalindrome(str, 0, str.length() - 1);
    }

    private boolean isPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;
        if (str.charAt(start) != str.charAt(end))
            return false;
        return isPalindrome(str, start + 1, end - 1);
    }
}
