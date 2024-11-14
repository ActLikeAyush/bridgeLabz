import java.util.LinkedHashSet;
import java.util.LinkedList;
class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class ListInterSection {
    public static int sizeOfList(Node head){
        Node current =head;
        int size=0;
        while(current!=null){
            System.out.println(current.data);
            size++;
            current=current.next;
        }
        return size;
    }
    
    public static Node findIntersection(Node head1, Node head2) {
        int size1 = sizeOfList(head1);
        int size2 = sizeOfList(head2);

        
        if (size1 > size2) {
            head1 = advanceByN(head1, size1 - size2);
        } else {
            head2 = advanceByN(head2, size2 - size1);
        }

        
        while (head1 != null && head2 != null) {
            if (head1 == head2) {
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        return null;
    }
    
    public static Node advanceByN(Node head, int n) {
        while (n > 0 && head != null) {
            head = head.next;
            n--;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head1=new Node(1);
        head1.next=new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        Node head2=new Node(8);
        head2.next = new Node(9);
        head2.next.next = new Node(10);
        head2.next.next = head1.next.next;
        Node current=head1;
        
        while(current!=null){
            System.out.println(current+"  "+current.data);
            current=current.next;
        }

        System.out.println(sizeOfList(head2));
        System.out.println(findIntersection(head1,head2));
    }
}
