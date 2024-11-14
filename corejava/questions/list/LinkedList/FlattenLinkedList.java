class Node {
    int data;
    Node next;
    Node child;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.child = null;
    }
}

public class FlattenLinkedList {
    public static Node flatten(Node head) {
        if (head == null) {
            return null;
        }

        Node current = head;

       
        while (current != null) {
            if (current.child != null) {
                
                Node nextNode = current.next;

               
                current.next = flatten(current.child);
                Node temp = current;
                while (temp.next != null) {
                    temp = temp.next;
                }

                temp.next = nextNode;

                current.child = null;
            }

            current = current.next;
        }

        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
       
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        head.next.child = new Node(4);
        head.next.child.next = new Node(5);

        System.out.println("Before Flattening:");
        printList(head);

        head = flatten(head);

        System.out.println("After Flattening:");
        printList(head);
    }
}
