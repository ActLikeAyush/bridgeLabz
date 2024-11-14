class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReorderList {
    public static void reorder(Node head) {
        if (head == null || head.next == null) {
            return; // No need to reorder if the list is empty or has only one element
        }

        // Step 1: Find the middle of the LinkedList
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        Node prev = null;
        Node current = slow;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // Step 3: Merge the two halves
        Node first = head;
        Node second = prev; // The head of the reversed second half

        while (second != null) {
            Node temp1 = first.next;
            Node temp2 = second.next;

            first.next = second; // Link the first node to the second
            second.next = temp1; // Link the second node to the first's next

            first = temp1; // Move to the next node in the first half
            second = temp2; // Move to the next node in the second half
        }
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
        // Creating a sample LinkedList: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original LinkedList:");
        printList(head);

        reorder(head);

        System.out.println("Reordered LinkedList:");
        printList(head);
    }
}
