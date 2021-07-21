package interview;

import java.util.*;

public class Graph {

    private static Map<Vertex, List<Vertex>> map = new HashMap<>();

    public Graph(Map<Vertex, List<Vertex>> map) {
        this.map = map;
    }

    public Graph() {
    }

    public Map<Vertex, List<Vertex>> getMap() {
        return map;
    }

    public void setMap(Map<Vertex, List<Vertex>> map) {
        this.map = map;
    }

    public void addVertex(Vertex vertex, ArrayList arrayList) {
        map.put(vertex, arrayList);
    }

    public void removeVertex(Vertex vertex) {
        map.remove(vertex);
    }

    public void addEdge(Vertex vertex1, Vertex vertex2) {
        map.get(vertex1).add(vertex2);
        map.get(vertex2).add(vertex1);
    }

    public static void createGraph() {
        Graph graph = new Graph();
        Vertex vertex = new Vertex("A");
        Vertex vertex2 = new Vertex("B");
        Vertex vertex3 = new Vertex("C");
        Vertex vertex4 = new Vertex("D");
        Vertex vertex5 = new Vertex("E");

        map.put(vertex,new ArrayList<>());
        map.put(vertex2,new ArrayList<>());
        map.put(vertex3,new ArrayList<>());
        map.put(vertex4,new ArrayList<>());
        map.put(vertex5,new ArrayList<>());

        graph.addEdge(vertex, vertex2);
        graph.addEdge(vertex, vertex3);
        graph.addEdge(vertex, vertex4);
        graph.addEdge(vertex2, vertex5);
        graph.addEdge(vertex3, vertex5);
        graph.addEdge(vertex4, vertex5);
    }

//    public Set<String> dfs(Graph graph, String root) {
//
//
//    }


    public static void main(String[] args) {
        createGraph();
        System.out.println(map);
    }


}
