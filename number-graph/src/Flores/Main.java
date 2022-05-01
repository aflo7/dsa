package Flores;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import org.apache.commons.lang3.RandomStringUtils;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Graph graph = new Graph();

//        graph.addVertex(1);
//        graph.addVertex(2);
//        graph.addVertex(3);
//        graph.addVertex(4);
//        graph.addVertex(5);
//        graph.addEdge(1, 2);
//        graph.addEdge(1, 4);
//        graph.addEdge(2, 3);
//        graph.addEdge(4, 3);
//        graph.addEdge(2, 4);
//        graph.addEdge(4, 5);
//
//        System.out.println("Expected: [1, 4, 5, 2, 3]");
//        System.out.println("Result: " + graph.depthFirstTraversal(graph, 1) + "\n");
//        
//        System.out.println("Expected: [3, 4, 5, 2, 1]");
//        System.out.println("Result: " + graph.depthFirstTraversal(graph, 3) + "\n");
//        
//        System.out.println("Expected: [1, 2, 4, 3. 5]");
//        System.out.println("Result: " + graph.breadthFirstTraversal(graph, 1) + "\n");
       
        for (int i = 1; i <= 1000; i++) { // generate 1000 nodes labelled 1-1000
            graph.addVertex(i);

            int randomNum = ThreadLocalRandom.current().nextInt(1, 5 + 1); //generate a random # between 1 and 5

            for (int j = 0; j < randomNum; j++) { // add connections to the vertex
                int rand = ThreadLocalRandom.current().nextInt(1, 1000 + 1);
                graph.addEdge(i, rand);
            }

        }
        
        System.out.println("Result: " + graph.depthFirstTraversal(graph, 1) + "\n");
        System.out.println("Result: " + graph.breadthFirstTraversal(graph, 1) + "\n");
    }

}
