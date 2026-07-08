import java.util.Stack;

class Solution {
    public int calculate(String s) {

        Stack<Integer> stack = new Stack<>();

        int result = 0; // current result
        int number = 0; // current number
        int sign = 1;   // 1 for +, -1 for -

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            }

            else if (ch == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            }

            else if (ch == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            }

            else if (ch == '(') {
                // Save current result and sign
                stack.push(result);
                stack.push(sign);

                result = 0;
                sign = 1;
            }

            else if (ch == ')') {
                // Complete current expression
                result += sign * number;
                number = 0;

                // Apply sign before '('
                result *= stack.pop();

                // Add result before '('
                result += stack.pop();
            }
        }

        // Add last number
        result += sign * number;

        return result;
    }
}