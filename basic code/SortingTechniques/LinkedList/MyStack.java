class MyStack <T>{
    Node head;
    public void push(T data){
        Node newNode=new Node();
        newNode.data=data;
        newNode.next=head;
        head=newNode;

    }
    public boolean isEmpty(){
        boolean t=false;
        if(head==null){
            return true;
        }
        else{
            return false;
        }
    }
    public void pop(){
        System.out.println("poping "+head.data);
        head=head.next;
    }
    

    public void peek(){
        if(head==null){
            System.out.println("stack is empty");
            return;
        }
        System.out.println(head.data);
    }

    public void show(){
        Node currNode=head;
        if(currNode==null){
            System.out.println("stack is empty");
            return;
        }
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
        


    }
    
}
