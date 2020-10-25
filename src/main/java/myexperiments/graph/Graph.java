package myexperiments.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph {

    int numberOfNodes = 0;
    Map<Integer, List<Integer>> adjacentList;

    public Graph() {
        this.adjacentList = new HashMap<>();
    }

    public void addVertex(int node) {
        if (!adjacentList.containsKey(node)) {
            adjacentList.put(node, new LinkedList<>());
            numberOfNodes++;
        }
    }

    public void addEdge(int node1, int node2) {
        //undirected graph
        addVertex(node1);
        addVertex(node2);

        adjacentList.get(node1).add(node2);
        adjacentList.get(node2).add(node1);
    }

    //
    public void printConnections() {
        for (int vertex : adjacentList.keySet()) {
            System.out.print(vertex + " => ");
            adjacentList.get(vertex)
                    .forEach(adjacent -> System.out.print(adjacent + ", "));
            System.out.println("");
        }
    }
}
