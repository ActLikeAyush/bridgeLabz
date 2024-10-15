import java.util.Queue;

class MyQueue <T>{
    Node head;
    Node Tail;

    public void Enqueue(T data){
         Node newNode=new Node();
        newNode.data=data;
        if(head==null){
            head=newNode;
            Tail=newNode;
            return;
        }
        Tail.next=newNode;
        Tail=newNode;
        

    }
    public void peek(){
        if(head==null){
            System.out.println("queue is empty");
        }
        System.out.println(head.data);
    }
    public void Dequeue(){
        if(head==null){
            System.out.println("queue is empty-->>>");
            return;
        }
        System.out.println("removing "+head.data);
        head=head.next;
    }
    public void show(){
        if(head==null){
            System.out.println("stack is empty");
            return;
        }
        Node curNode=head;
        while(curNode!=null){
            System.out.println(curNode.data);
            curNode=curNode.next;
            
        }
    }
}
