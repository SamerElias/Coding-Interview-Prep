package samer.Graphs;

import java.util.List;

public class GraphNode {

    int val;
    List<GraphNode> neighbors;

    GraphNode(){}

    GraphNode(int val) {
        this.val = val;
    }

    GraphNode(int val, List<GraphNode> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }

    public void addNeighbor(int val) {
        this.neighbors.add(new GraphNode(val));
    }

}
