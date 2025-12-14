package dsa;

import java.util.*;

public class Topological {

    // Graph class with adjacency list representation
    static class Graph {
        private int vertices;
        private List<List<Integer>> adjList;

        public Graph(int vertices) {
            this.vertices = vertices;
            adjList = new ArrayList<>(vertices);
            for (int i = 0; i < vertices; i++) {
                adjList.add(new ArrayList<>());
            }
        }

        public void addEdge(int from, int to) {
            adjList.get(from).add(to);
        }

        public int getVertices() {
            return vertices;
        }

        public List<Integer> getNeighbors(int vertex) {
            return adjList.get(vertex);
        }

        public void printGraph() {
            System.out.println("Graph adjacency list:");
            for (int i = 0; i < vertices; i++) {
                System.out.print(i + " -> ");
                for (int neighbor : adjList.get(i)) {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }
    }

    // TODO: Implement your topological sort algorithm here
    public static void topologicalSort(Graph graph) {
        boolean[] visited = new boolean[graph.getVertices()]; // Changed to boolean[] (primitive)
        Stack<Integer> stack = new Stack<>();

        // Visit all vertices
        for (int i = 0; i < graph.getVertices(); i++) {
            if (!visited[i]) {
                topologicaldfs(graph, i, stack, visited);
            }
        }

        // Print topological order
        System.out.println("\nTopological Sort Result:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static void topologicaldfs(Graph graph, int vertex, Stack<Integer> stack, boolean[] visited) {
        visited[vertex] = true;
        for (int neighbor : graph.getNeighbors(vertex)) {
            if (!visited[neighbor]) {
                topologicaldfs(graph, neighbor, stack, visited);
            }
        }
        stack.push(vertex);
    }

    public static void main(String[] args) {
        System.out.println("=== Simple Graph Example ===");
        // Simple DAG with 6 vertices
        // Dependencies:
        // 5 -> 2, 0
        // 4 -> 0, 1
        // 2 -> 3
        // 3 -> 1
        Graph simpleGraph = new Graph(6);
        simpleGraph.addEdge(5, 2);
        simpleGraph.addEdge(5, 0);
        simpleGraph.addEdge(4, 0);
        simpleGraph.addEdge(4, 1);
        simpleGraph.addEdge(2, 3);
        simpleGraph.addEdge(3, 1);

        simpleGraph.printGraph();
        topologicalSort(simpleGraph);
        // One valid topological order: 5, 4, 2, 3, 1, 0

        System.out.println("\n=== Course Prerequisites Example ===");
        // More complex example - Course prerequisites (8 courses)
        // Course 0: No prerequisites
        // Course 1: Requires Course 0
        // Course 2: Requires Course 0
        // Course 3: Requires Course 1, 2
        // Course 4: Requires Course 1
        // Course 5: Requires Course 2
        // Course 6: Requires Course 3, 4
        // Course 7: Requires Course 5, 6
        Graph courseGraph = new Graph(8);
        courseGraph.addEdge(0, 1);
        courseGraph.addEdge(0, 2);
        courseGraph.addEdge(1, 3);
        courseGraph.addEdge(2, 3);
        courseGraph.addEdge(1, 4);
        courseGraph.addEdge(2, 5);
        courseGraph.addEdge(3, 6);
        courseGraph.addEdge(4, 6);
        courseGraph.addEdge(5, 7);
        courseGraph.addEdge(6, 7);

        courseGraph.printGraph();
        topologicalSort(courseGraph);
        // One valid topological order: 0, 1, 2, 4, 3, 5, 6, 7
    }
}