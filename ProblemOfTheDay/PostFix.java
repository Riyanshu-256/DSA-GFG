package ProblemOfTheDay;

import java.util.Stack;

public class PostFix {
        public int evaluatePostfix(String[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (String token : arr) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;

                switch (token) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = floorDivide(a, b);
                        break;
                    case "^":
                        result = (int)Math.pow(a, b); // power operator
                        break;
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token)); // push numbers
            }
        }
        return stack.pop();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || 
               token.equals("*") || token.equals("/") || 
               token.equals("^");
    }

    // Custom floor division
    private int floorDivide(int a, int b) {
        int result = a / b; 
        if ((a ^ b) < 0 && a % b != 0) {
            result--;
        }
        return result;
    }
}
