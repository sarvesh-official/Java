package Problems;

import java.util.Scanner;
import java.util.Stack;

/**
 * PostfixToInfix
 */
public class PostfixToInfix {

    public static boolean isOperator(char c) {
        
        return (c == '-' || c == '*' || c == '+' || c == '/');
    }

    public static void Converter(String postfix) {
        
        Stack<String> s = new Stack<>();

        String[] tokens = postfix.split("\\s+");

        for (String ch : tokens) {

            if (isOperator(ch.charAt(0))) {

                String operand2 = s.pop();
                String operand1 = s.pop();

                String infix = "(" + operand1 + " " + ch + " " + operand2 + ")";

                s.push(infix);
            } else {
                s.push(ch);
            }

        }
        
        System.out.println(s.peek());
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String Input = sc.nextLine();

        Converter(Input);
    }
}