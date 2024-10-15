import java.util.*;

// import javax.xml.soap.Node;

class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data=data;
        this.next=null;
    }


}
public class ListProblem {
    public static boolean isCycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static LinkedList removeNth(Node head,int n){
        LinkedList<Integer> listNew=new LinkedList<>();

       Node fast=head;
       Node slow=head;
        for(int i = 0;i<n+1;i++){
             fast=fast.next;
            System.out.println(fast.data+" i "+i);
        }
        Node afterDeleting=null;
        while(fast!=null){

            fast=fast.next;
            slow=slow.next;
            System.out.println(slow.data+" slow");
            System.out.println(fast);
        }
        // slow=slow.next.next;
        afterDeleting=slow.next.next;
        slow.next=afterDeleting;
        System.out.println("sd  "+afterDeleting.data);
        Node current=head;
        while(current!=null){
            listNew.add((Integer)current.data);
        }
        return listNew;

    }
    public static void main(String[] args) {
        LinkedList <Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(list.get(0));
      
        Node<Integer> first=new Node<>(list.get(0));
        Node<Integer>second=new Node<>(list.get(1));
        Node<Integer>third =new Node<>(list.get(2));
        Node<Integer>fourth =new Node<>(list.get(3));
        Node<Integer>fifth =new Node<>(list.get(4));

        System.out.println(first);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        // fifth.next=second;
        System.out.println("is it cycle in linkedlist "+isCycle(first));
        int n=3;
        System.out.println("before removing element "+list);
        removeNth(first,n);
        System.out.println("after removing element "+listNew);
            // Node<Integer> current=first;
        
            // int i=0;
        
            // while(i<5){
            //     System.out.println(current.data);
            //     current=current.next;
            //     i++;
            // }
    }
}
