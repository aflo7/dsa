package Flores;

import java.util.*;
import java.util.Map.Entry;

public class Graph {

    // unweighted graph with Adjacency List (for dfs and bfs)
    public Map<Vertex, List<Vertex>> adjVertices = new HashMap<>();

    // weighted graph required for Dijkstra's algorithm
    public Set<Vertex> vertexesWithWeights = new HashSet<>();

    public void addVertex(int label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    public void addEdge(int label1, int label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
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
