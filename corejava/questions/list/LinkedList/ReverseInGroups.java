class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseInGroups {

    
    public static Node reverseInGroups(Node head, int k) {
        if (head == null) {
            return null;
        }

        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;

        
        while (current != null && count < k) {
            next = current.next; // Save the next node
            current.next = prev; // Reverse the current node's pointer
            prev = current; // Move prev to this node
            current = next; // Move to the next node
            count++;
        }

      
        if (next != null) {
            head.next = reverseInGroups(next, k);
        }

       
        return prev;
    }

   
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
       
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        System.out.println("Original List:");
        printList(head);

      
        int k = 5;
        Node newHead = reverseInGroups(head, k);

        System.out.println("Reversed List in groups of " + k + ":");
        printList(newHead);
    }
}
