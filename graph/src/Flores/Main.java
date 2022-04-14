package Flores;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Graph graph = new Graph();
        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mark");
        graph.addVertex("Rob");
        graph.addVertex("Maria");
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Rob");
        graph.addEdge("Alice", "Mark");
        graph.addEdge("Rob", "Mark");
        graph.addEdge("Alice", "Maria");
        graph.addEdge("Rob", "Maria");

        // add traversal methods
        System.out.println("Expected: [Bob, Rob, Maria, Alice, Mark]");
        System.out.println("Result: " + graph.depthFirstTraversal(graph, "Bob") + "\n");
        
        System.out.println("Expected: [Mark, Rob, Maria, Alice, Bob]");
        System.out.println("Result: " + graph.depthFirstTraversal(graph, "Mark") + "\n");
        
        System.out.println("Expected: [Bob, Alice, Rob, Mark, Maria]");
        System.out.println("Result: " + graph.breadthFirstTraversal(graph, "Bob") + "\n");
        
       
    }

}
