import java.util.Stack;

public class BalancedParentheses {

    
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        
        for (char ch : s.toCharArray()) {
          
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
           
            else if (ch == ')' || ch == '}' || ch == ']') {
                
                if (stack.isEmpty()) {
                    return false; 
                }
                char top = stack.pop(); 

                
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        
        return stack.isEmpty();
    }

   
    public static void main(String[] args) {
        String s1 = "([{}])"; 
        String s2 = "({[})]";
        String s3 = "(a + b) * (c + d)";

        System.out.println("Is s1 balanced? " + isBalanced(s1));
        System.out.println("Is s2 balanced? " + isBalanced(s2));
        System.out.println("Is s3 balanced? " + isBalanced(s3));
    }
}
