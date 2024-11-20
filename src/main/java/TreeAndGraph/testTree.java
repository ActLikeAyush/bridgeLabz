package TreeAndGraph;

public class testTree {
    public static void main(String args[]){
        BinarySearchTree.insert(2);
        BinarySearchTree.insert(3);
        BinarySearchTree.insert(22);
        BinarySearchTree.insert(26);
        BinarySearchTree.insert(5);
        BinarySearchTree.insert(1);
        BinarySearchTree.inOrder();
        System.out.println(".............");
        BinarySearchTree.preOrder();
        System.out.println(".............");
        BinarySearchTree.postOrder();


//        now testing graph
        System.out.println("graph \n");
        GraphAdjacenyMatrix g=new GraphAdjacenyMatrix(5);
//        g.addEdge(0,1);
//        g.addEdge(0,2);
//        g.addEdge(1,3);
//        g.addEdge(2,3);
//        g.addEdge(3,4);
//        g.Display();

        GraphAdjacenyMatrix graph=new GraphAdjacenyMatrix(5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(1, 5);
        graph.addEdge(4, 2);
        graph.addEdge(3, 5);


        graph.Display();



    }
}
