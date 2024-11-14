public class MyLinkedList <T> {
    Node head;
    
    // Node n=new Node();
    public void addFirstData(T data){
        Node n=new Node();
        n.data=data;
        if(head==null){
            head=n;
        }
        else{
            n.next= head;
            head=n;
        }

    }
    public void deleteAt(int index){
        
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currentNode=head;
        Node afterDeletingNode=null;
        for(int i=0;i<index-1;i++){
            currentNode=currentNode.next;
        }
        afterDeletingNode=currentNode.next;
        currentNode.next=afterDeletingNode.next;
        System.out.println(afterDeletingNode.data+" is deleted from the linkedlist");


    }
    public void addLastData(T data){
        Node n=new Node();
        n.data= data;
        if(head==null){
            head=n;
        }
        else{
            Node currentNode=head;
            while(currentNode.next!=null){
                currentNode=currentNode.next;
            }
            currentNode.next=n;
        }
    }

    public void show() {
       
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null"); 
    }
}
