package Flores;

import java.util.*;

public class Graph {

    // unweighted graph with Adjacency List
    public Map<Vertex, List<Vertex>> adjVertices = new HashMap<>();

    public void addVertex(int label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    public void removeVertex(int label) {
        Vertex v = new Vertex(label);
        adjVertices.values().stream().forEach(e -> e.remove(v));
        adjVertices.remove(new Vertex(label));
    }

    public void addEdge(int label1, int label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

    public void removeEdge(int label1, int label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> eV1 = adjVertices.get(v1);
        List<Vertex> eV2 = adjVertices.get(v2);
        if (eV1 != null) {
            eV1.remove(v2);
        }
        if (eV2 != null) {
            eV2.remove(v1);
        }
    }

    public List<Vertex> getAdjVertices(int label) {
        return adjVertices.get(new Vertex(label));
    }

    Set<Integer> depthFirstTraversal(Graph graph, int root) {
        int numVisited = 0;
        Set<Integer> visited = new LinkedHashSet<Integer>();
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(root);
        while (!stack.isEmpty()) {
            numVisited++;
            
            int vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                
                for (Vertex v : graph.getAdjVertices(vertex)) {
                    stack.push(v.label);
                    
                }
            }
        }
        
        System.out.println("Success");
        System.out.println("Visited: " + numVisited);
        return visited;
    }

    Set<Integer> breadthFirstTraversal(Graph graph, int root) {
        int numVisited = 0;
        Set<Integer> visited = new LinkedHashSet<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            numVisited++;
            
            int vertex = queue.poll();
            for (Vertex v : graph.getAdjVertices(vertex)) {
                if (!visited.contains(v.label)) {
                    visited.add(v.label);
                    queue.add(v.label);
                    
                }
            }
        }
        
        System.out.println("Success");
        System.out.println("Visited: " + numVisited);
        return visited;
    }
}
