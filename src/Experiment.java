public class Experiment {

    public void runTraversals(Graph g) {

        long start;
        long end;

        System.out.println("BFS Traversal:");
        start = System.nanoTime();

        g.bfs(0);

        end = System.nanoTime();

        System.out.println("BFS Time: " + (end - start) + " ns");

        System.out.println();

        System.out.println("DFS Traversal:");

        start = System.nanoTime();

        g.dfs(0);

        end = System.nanoTime();

        System.out.println("DFS Time: " + (end - start) + " ns");
    }

    public void runMultipleTests() {

        int[] sizes = {10, 30, 100};

        for (int size : sizes) {

            System.out.println("\nGRAPH SIZE: " + size);

            Graph g = new Graph();

            for (int i = 0; i < size; i++) {
                g.addVertex(new Vertex(i));
            }

            for (int i = 0; i < size - 1; i++) {
                g.addEdge(i, i + 1);
            }

            runTraversals(g);
        }
    }

    public void printResults() {
        System.out.println("Experiments completed.");
    }
}
