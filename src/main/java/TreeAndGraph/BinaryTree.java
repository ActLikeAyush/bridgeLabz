package TreeAndGraph;

public class BinaryTree {

    public static void insert(Node root,int data){
        root=insertRec(root,data);
    }

    public static Node insertRec(Node root, int data) {

        if(root==null){
            root=new Node(data);
        }

        return root;
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        preOrder(root.left);
        System.out.print(root.data + " ");
        preOrder(root.right);

    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        preOrder(root.right);
        preOrder(root.left);
        System.out.print(root.data + " ");


    }
    public static void main (String args[]){
        Node root=new Node(2);
        root.left=new Node(4);
        root.right=new Node(6);
        root.left.left=new Node(8);
        root.left.right=new Node(10);
        root.right.left=new Node(12);

        BinaryTree.preOrder(root);
        System.out.println("");
        BinaryTree.inOrder(root);
        System.out.println("");
        BinaryTree.postOrder(root);






    }
}
