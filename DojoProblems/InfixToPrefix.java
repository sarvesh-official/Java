package DojoProblems;

import java.util.Stack;

public class InfixToPrefix {

    private static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        else if (op == '*' || op == '/') return 2;
        else return 0;
    }

    private static String infixToPrefix(String expression) {
        Stack<Character> stack = new Stack<>();
        StringBuilder prefix = new StringBuilder();

        for (int i = expression.length() - 1; i >= 0; i--) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch)) {
                prefix.append(ch);
            } else if (ch == ')') {
                stack.push(ch);
            } else if (ch == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    prefix.append(stack.pop());
                }
                if (!stack.isEmpty()) stack.pop(); // Pop the ')'
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) > precedence(ch)) {
                    prefix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            prefix.append(stack.pop());
        }

        return prefix.reverse().toString();
    }

    public static void main(String[] args) {
        String infixExpression = "10+5*2";
        String prefixExpression = infixToPrefix(infixExpression);
        System.out.println(prefixExpression); // Output should be "*+857"
    }
}
