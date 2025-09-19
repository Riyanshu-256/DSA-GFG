package ProblemOfTheDay;

public class PranthesisValid {
    public int minParentheses(String s) {
        int open = 0;   // count of unmatched '('
        int close = 0;  // count of unmatched ')'

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
            } else { // ch == ')'
                if (open > 0) {
                    open--; // matched with a previous '('
                } else {
                    close++; // no matching '(' available
                }
            }
        }

        // total unmatched = open + close
        return open + close;
    }
}
