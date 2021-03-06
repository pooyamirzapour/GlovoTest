package interview;

import java.util.*;

public class Graph {

    volatile Integer integer;

    static Map<Vertex, List<Vertex>> map = new HashMap<>();

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

    public static void addEdge(Vertex vertex, Vertex vertex2) {
        map.get(vertex).add(vertex2);
        map.get(vertex2).add(vertex);
    }


    public static Graph createGraph() {
        Graph graph = new Graph();

        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");

        map.put(vertexA, new ArrayList<>());
        map.put(vertexB, new ArrayList<>());
        map.put(vertexC, new ArrayList<>());
        map.put(vertexD, new ArrayList<>());
        map.put(vertexE, new ArrayList<>());

        addEdge(vertexA, vertexB);
        addEdge(vertexA, vertexC);
        addEdge(vertexA, vertexD);
        addEdge(vertexB, vertexE);
        addEdge(vertexC, vertexE);
        addEdge(vertexD, vertexE);
        graph.setMap(map);
        return graph;

    }


    public static Set<Vertex> dfs(Vertex vertex) {
        Stack<Vertex> stack = new Stack<>();
        stack.add(vertex);
        Set<Vertex> vertexSet = new HashSet<>();
        vertexSet.add(vertex);
        List<Vertex> vertices = map.get(vertex);

        while (!stack.isEmpty()) {
            for (Vertex ver : vertices) {
                if (!vertexSet.contains(ver)) {
                    stack.add(ver);
                    List<Vertex> vertices = map.get(ver);

                } else {
                    Vertex pop = stack.pop();
                    vertexSet.add(pop);
                }
            }
        }
        return vertexSet;
    }


    public static void main(String[] args) {
        createGraph();
        Vertex vertex = new Vertex("A");
        System.out.println(dfs(vertex));
    }


}
