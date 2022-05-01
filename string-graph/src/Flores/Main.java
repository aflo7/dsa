package Flores;

import java.util.ArrayList;
import org.apache.commons.lang3.RandomStringUtils;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Graph graph = new Graph();
//        graph.addVertex("Bob");
//        graph.addVertex("Alice");
//        graph.addVertex("Mark");
//        graph.addVertex("Rob");
//        graph.addVertex("Maria");
//        graph.addEdge("Bob", "Alice");
//        graph.addEdge("Bob", "Rob");
//        graph.addEdge("Alice", "Mark");
//        graph.addEdge("Rob", "Mark");
//        graph.addEdge("Alice", "Maria");
//        graph.addEdge("Rob", "Maria");
//
//        // add traversal methods
//        System.out.println("Expected: [Bob, Rob, Maria, Alice, Mark]");
//        System.out.println("Result: " + graph.depthFirstTraversal(graph, "Bob") + "\n");
//        
//        System.out.println("Expected: [Mark, Rob, Maria, Alice, Bob]");
//        System.out.println("Result: " + graph.depthFirstTraversal(graph, "Mark") + "\n");
//        
//        System.out.println("Expected: [Bob, Alice, Rob, Mark, Maria]");
//        System.out.println("Result: " + graph.breadthFirstTraversal(graph, "Bob") + "\n");

        ArrayList<String> names = new ArrayList<String>(); // to hold 1,000 random names

        for (int i = 0; i < 999; i++) {
            int length = 10;
            boolean useLetters = true;
            boolean useNumbers = false;
            String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
            names.add(generatedString);
        }

    }

}
