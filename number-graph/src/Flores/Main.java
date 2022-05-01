package Flores;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();

       
        for (int i = 1; i <= 1000; i++) { // generate 1000 nodes labelled 1-1000
            graph.addVertex(i);

            int randomNum = ThreadLocalRandom.current().nextInt(1, 5 + 1); //generate a random # between 1 and 5

            for (int j = 0; j < randomNum; j++) { // add connections to the vertex
                int rand = ThreadLocalRandom.current().nextInt(1, 1000 + 1);
                graph.addEdge(i, rand);
            }

        }
        
        System.out.println("DFS Result Starting at 1: " + graph.depthFirstTraversal(graph, 1) + "\n");
        System.out.println("BFS Result Starting at 1: " + graph.breadthFirstTraversal(graph, 1) + "\n");
    }

}
