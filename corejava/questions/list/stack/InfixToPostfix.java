import java.util.Stack;

public class InfixToPostfix {

    // Method to get precedence of operators
    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1; //(
    }

    // Method to convert infix to postfix
    public static String infixToPostfix(String expression) {
        // Initialize an empty result (postfix expression)
        StringBuilder result = new StringBuilder();

        // Stack to store operators
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the expression
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // If the character is an operand, add it to the result
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If the character is '(', push it to the stack
            else if (c == '(') {
                stack.push(c);
            }
            // If the character is ')', pop and append to result until '(' is found
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // remove '('
            }
            // If the character is an operator
            else {
                // Pop from the stack to result if the current operator's precedence is lower or
                // equal
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c); // Push the current operator to stack
            }
        }

        // Pop all remaining operators from the stack to the result
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        // Convert StringBuilder to String and return
        return result.toString();
    }

    public static void main(String[] args) {
        // String infixExpression = "A+B*(C^D-E)";
        String infixExpression = "(A+b(c+d*x)-y)";
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
    }
}
