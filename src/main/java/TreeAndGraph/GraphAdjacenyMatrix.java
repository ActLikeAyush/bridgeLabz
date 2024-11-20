package TreeAndGraph;

import java.util.Arrays;

public class GraphAdjacenyMatrix {
    private int [][]adjMatrix;
    private int numNode;

    public GraphAdjacenyMatrix(int numNode) {
        this.numNode = numNode;
        adjMatrix=new int[numNode][numNode];

    }

    public void addEdge(int src,int dest){
        adjMatrix[src-1][dest-1]=1;
        adjMatrix[dest-1][src-1]=1;
    }
    public void Display() {
        for (int[] row : adjMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }

}
