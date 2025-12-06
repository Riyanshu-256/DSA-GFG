/*
You are given an integer n. Your task is to determine whether it is a palindrome.

A number is considered a palindrome if it reads the same backward as forward, like the string examples "MADAM" or "MOM".
*/

package S04_Recursion;

public class Palindrome {
    boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        return check(s, start, end);
    }
    
    boolean check(String s, int start, int end) {
        if (start >= end) return true;
        
        return (s.charAt(start) == s.charAt(end)) 
                && check(s, start + 1, end - 1);
    }
}
