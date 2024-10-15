class BST{
    Node root;
    public void insert(int data){

        root=inRec(root, data);
    }
    public Node inRec(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else if(data <root.data){
            root.left=inRec(root.left, data);
        }
        else if(data>root.data){
            root.right=inRec(root.right, data);
        }

        return root;
    }    
    public void inOrder(){
        inOrderRec(root);
    }
    public void inOrderRec(Node root){
        if(root!=null){
            inOrderRec(root.left);
            System.out.println(root.data+" ");
            inOrderRec(root.right);
        }
    }
    public void preOrder(){
        recPreOrder(root);
    }
    public void recPreOrder(Node root){
        if(root==null){
            // System.out.println("-1");
            return;
        }
        System.out.println(root.data+" ");
        recPreOrder(root.left);
        recPreOrder(root.right);
    }
    public void postOreder(){
        recPost(root);
    }
    public void recPost( Node root){
        if(root!=null){
            recPost(root.left);
            recPost(root.right);
            System.out.println(root.data);

        }
    }

    public void searching(int data){
        Node res=searchRec(root,data);
        if(res!=null){
            System.out.println("data found:");
        }
        else{
            System.out.println("data is not found");
        }
    }
    public Node searchRec(Node root,int data){
        if(root==null||root.data==data){
            return root;
        }
        else if(root.data<data){
            return searchRec(root.right, data);
        }
        return searchRec(root.left, data);
        
    }
}