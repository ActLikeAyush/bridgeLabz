public class BT {
    Node root;
    public Node insert(int data){
        Node newNode= new Node(data);
        // newNode.data=data;
        if(root==null){
            return newNode;
        }
        Node currNode= root ;
        while(true){
            if(data<currNode.data){
                return root.left=newNode;

            }

            else {
                return root.right=newNode;

            }
        }
    }

    public void prinT(){
        while(true){
            
        }
    }
}
