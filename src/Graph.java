import java.util.*;

public class Graph {

    private Map<Integer, List<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(Vertex v) {
        adjacencyList.putIfAbsent(v.getId(), new ArrayList<>());
    }

    public void addEdge(int from, int to) {
        adjacencyList.get(from).add(to);
        adjacencyList.get(to).add(from);
    }

    public void printGraph() {
        for (Integer vertex : adjacencyList.keySet()) {
            System.out.println(vertex + " -> " + adjacencyList.get(vertex));
        }
    }

    // BFS
    public void bfs(int start) {

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {

            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbor : adjacencyList.get(vertex)) {

                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        System.out.println();
    }

    // DFS
    public void dfs(int start) {

        Set<Integer> visited = new HashSet<>();

        dfsHelper(start, visited);

        System.out.println();
    }

    private void dfsHelper(int vertex, Set<Integer> visited) {

        visited.add(vertex);

        System.out.print(vertex + " ");

        for (int neighbor : adjacencyList.get(vertex)) {

            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }
}
