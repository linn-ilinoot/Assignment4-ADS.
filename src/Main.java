public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();

        // Create vertices
        for (int i = 0; i < 10; i++) {
            graph.addVertex(new Vertex(i));
        }

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        graph.addEdge(3, 7);
        graph.addEdge(4, 8);
        graph.addEdge(5, 9);

        System.out.println("GRAPH:");

        graph.printGraph();

        System.out.println("\nBFS:");
        graph.bfs(0);

        System.out.println("\nDFS:");
        graph.dfs(0);

        Experiment experiment = new Experiment();

        experiment.runMultipleTests();

        experiment.printResults();
    }
}


