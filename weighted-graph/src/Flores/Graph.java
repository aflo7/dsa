package Flores;

import java.util.*;

public class Graph {

    public Set<Vertex> nodes = new HashSet<>();

    public void addNode(Vertex nodeA) {
        nodes.add(nodeA);
    }

    public void printNodes() {
        for (Vertex s : nodes) {
            System.out.println("Shortest Path to: " + s.toString());
            System.out.println("->" + s.shortestPath);
            System.out.println("Distance: " + s.distance);
            System.out.println();
        }
    }


}
