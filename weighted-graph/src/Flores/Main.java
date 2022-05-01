package Flores;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Graph graph = new Graph();
        Dijkstra d = new Dijkstra();

//        Vertex nodeA = new Vertex("A");
//        Vertex nodeB = new Vertex("B");
//        Vertex nodeC = new Vertex("C");
//        Vertex nodeD = new Vertex("D");
//        Vertex nodeE = new Vertex("E");
//        Vertex nodeF = new Vertex("F");
//
//        nodeA.addDestination(nodeB, 10);
//        nodeA.addDestination(nodeC, 15);
//
//        nodeB.addDestination(nodeD, 12);
//        nodeB.addDestination(nodeF, 15);
//
//        nodeC.addDestination(nodeE, 10);
//
//        nodeD.addDestination(nodeE, 2);
//        nodeD.addDestination(nodeF, 1);
//
//        nodeF.addDestination(nodeE, 5);
//
//        graph.addNode(nodeB);
//        graph.addNode(nodeC);
//        graph.addNode(nodeD);
//        graph.addNode(nodeE);
//        graph.addNode(nodeF);
//        graph.addNode(nodeA);
//        
//
//        graph = d.calculateShortestPathFromSource(graph, nodeA);
//        
//        graph.printNodes();
        for (int i = 0; i < 1000; i++) {
            Random rand = new Random();

// Obtain a number between [0 - 100,000].
            int n = rand.nextInt(100000);
            n += 1;
            System.out.println(n);
            
           
            
        }

    }

}
