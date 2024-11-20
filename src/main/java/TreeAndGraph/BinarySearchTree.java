package TreeAndGraph;

public class BinarySearchTree {
    static Node root;

    public static void insert(int data) {
       root= insertRec(root,data);
    }
    public static Node insertRec(Node root,int data ) {

        if(root ==null){
            root=new Node(data);
        }
        else if (data<root.data) {
            root.left=insertRec(root.left,data);
        }
        else if (data>root.data) {
            root.right=insertRec(root.right,data);
        }

        return root;
    }
    public static void inOrder(){
        inOrderRec(root);
    }
    public static Node inOrderRec(Node root){
        if(root!=null){
            inOrderRec(root.left);
            System.out.print(root.data+" ");
            inOrderRec(root.right);

        }
        return root;
    }
    public static void preOrder(){
        preOrderRec(root);
    }

    public static Node preOrderRec(Node root) {
        if(root!=null){
            System.out.print(root.data+" ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }

        return root;
    }
    public  static void postOrder(){
        postOrderRec(root);
    }

    public static Node postOrderRec(Node root) {
        if(root!=null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data+" ");
        }
        return root;
    }


}
