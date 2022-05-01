/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flores;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author andres
 */
public class Dijkstra {

    public Graph calculateShortestPathFromSource(Graph graph, Vertex source) {
        source.setDistance(0);

        Set<Vertex> seen = new HashSet<>();
        Set<Vertex> unseen = new HashSet<>();

        unseen.add(source);

        while (!unseen.isEmpty()) {
            Vertex currentNode = getLowestDistanceNode(unseen);
            unseen.remove(currentNode);
            for (Entry< Vertex, Integer> adjacencyPair
                    : currentNode.getAdjacentNodes().entrySet()) {
                Vertex adjacentNode = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();
                if (!seen.contains(adjacentNode)) {
                    calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
                    unseen.add(adjacentNode);
                }
            }
            seen.add(currentNode);
        }
        return graph;
    }

    private static Vertex getLowestDistanceNode(Set<Vertex> unsettledNodes) {
        Vertex lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Vertex Vertex : unsettledNodes) {
            int nodeDistance = Vertex.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = Vertex;
            }
        }
        return lowestDistanceNode;
    }

    private static void calculateMinimumDistance(Vertex evaluationNode,
            Integer edgeWeight, Vertex sourceNode) {
        Integer sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeight < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeight);
            LinkedList<Vertex> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }
}
