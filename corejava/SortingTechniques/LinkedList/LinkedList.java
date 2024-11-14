class LinkedList{

    Node head;
    public void add(int Data1){

        // every time we will run this method we will create a new node 
        
        Node newNode=new Node();
        // assign the new node with null reference 
        newNode.next = null;
        // now we will add data into it 
        // whatever data is pass by user it will came in Data1 
        newNode.data=Data1;


        // 

        if(head==null){
            head=newNode;  
        }
        else{
            
            Node nextNode=head;
            while(nextNode.next!=null){
                nextNode=nextNode.next;

            }
            nextNode.next=newNode;
        }
        

    }
    public void show(){
        Node currentNode=head;
        while(currentNode.next!=null){
            System.out.println(currentNode.data);
            currentNode=currentNode.next;

        }
        System.out.println(currentNode.data);
    }
}