import java.util.Stack;

public class SortStack {

    
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return; 
        }

        
        int top = stack.pop();

       
        sortStack(stack);

        
        insertInSortedOrder(stack, top);
    }

   
    public static void insertInSortedOrder(Stack<Integer> stack, int element) {
       
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element); 
            return;
        }

       
        int top = stack.pop();

        
        insertInSortedOrder(stack, element);

       
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(2);
        stack.push(9);
        stack.push(1);
        stack.push(3);

        System.out.println("Original Stack: " + stack);

      
        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
