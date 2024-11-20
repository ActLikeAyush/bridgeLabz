package TreeAndGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DFSgraph {

    private Map<Integer, List<Integer>> adjList;
    DFSgraph(){
        adjList=new HashMap<>();
    }
    public void addEdges(int src,int dest){
        adjList.computeIfAbsent(src,k->new ArrayList<>()).add(dest);
        adjList.computeIfAbsent(dest,k->new ArrayList<>()).add(src);
    }
}
