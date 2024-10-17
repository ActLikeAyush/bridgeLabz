import java.util.LinkedList;

public class ListPalindrome {
    public static void byCollection(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        int size = list.size();
        System.out.println(size);
        boolean palindrome=false;
        for (int i = 0; i < size / 2; i++) {
            if (!list.get(i).equals(list.get(size - i - 1))) {
                palindrome = false;
                break;
            }
        }
        if (palindrome==true) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
    public static void byOwnImpl(){
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(1);

        Node current=head1;
       
        while(current!=null){
            
           
            current=current.next;
            
        }
        if(current==head1){
            System.out.println("palindrome");
        }
        else{
            System.out.println("palindrome");
        }
        if(head1==current){
            System.out.println("Palindrome  !");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        
        // byOwnImpl();
        byCollection();
    }    
}
