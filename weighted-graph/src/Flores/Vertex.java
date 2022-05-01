package Flores;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author andres
 */
public class Vertex {

    String name;
    int id;
    List<Vertex> shortestPath = new LinkedList<>();
    Integer distance = Integer.MAX_VALUE;

    Map<Vertex, Integer> adjacentNodes = new HashMap<>();

    public List<Vertex> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<Vertex> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public Map<Vertex, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(Map<Vertex, Integer> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }

    public Vertex(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public void addDestination(Vertex destination, int distance) {
        adjacentNodes.put(destination, distance);
    }

    @Override
    public String toString() {
        return this.name; //To change body of generated methods, choose Tools | Templates.
    }

}
