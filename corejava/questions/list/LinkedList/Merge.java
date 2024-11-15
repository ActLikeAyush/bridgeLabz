class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Merge {
    public static Node mergeTwoLists(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node current = dummy;

        while (l1 != null && l2 != null) {
            
            if (l1.data <= l2.data) {
                current.next = l1; 
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next; 
            }
            current = current.next; 
        }

      
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

       
        return dummy.next;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);

        
        Node mergedList = mergeTwoLists(l1, l2);

        
        printList(mergedList);
    }
}
