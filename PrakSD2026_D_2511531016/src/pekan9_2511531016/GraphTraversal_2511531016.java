package pekan9_2511531016;
import java.util.*;

public class GraphTraversal_2511531016 {
    private Map<String, List<String>> graph_1016 = new HashMap<>();
    // Menambahkan edge (graf tak berarah)
    public void addEdge(String node1, String node2) {
        graph_1016.putIfAbsent(node1, new ArrayList<>());
        graph_1016.putIfAbsent(node2, new ArrayList<>());
        graph_1016.get(node1).add(node2);
        graph_1016.get(node2).add(node1);
    }
    // Menampilkan graf awal
    public void printGraph() {
        System.out.println("Graf Awal (Adjacency List):");
        for (String node_1016 : graph_1016.keySet()) {
            System.out.print(node_1016 + " -> ");
            List<String> neighbors_1016 = graph_1016.get(node_1016);
            System.out.println(String.join(", ", neighbors_1016));
        }
        System.out.println();
    }
    // DFS rekursif
    public void dfs(String start_1016) {
        Set<String> visited_1016 = new HashSet<>();
        System.out.println("Penelusuran DFS:");
        dfsHelper(start_1016, visited_1016);
        System.out.println();
    }
    private void dfsHelper(String current_1016, Set<String> visited_1016) {
        if (visited_1016.contains(current_1016)) return;
        visited_1016.add(current_1016);
        System.out.print(current_1016 + " ");
        for (String neighbor_1016 : graph_1016.getOrDefault(current_1016, new ArrayList<>())) {
            dfsHelper(neighbor_1016, visited_1016);
        }
    }
    // BFS iteratif
    public void bfs(String start_1016) {
        Set<String> visited_1016 = new HashSet<>();
        Queue<String> queue_1016 = new LinkedList<>();
        queue_1016.add(start_1016);
        visited_1016.add(start_1016);
        System.out.println("Penelusuran BFS:");
        while (!queue_1016.isEmpty()) {
            String current_1016 = queue_1016.poll();
            System.out.print(current_1016 + " ");
            for (String neighbor_1016 : graph_1016.getOrDefault(current_1016, new ArrayList<>())) {
                if (!visited_1016.contains(neighbor_1016)) {
                    queue_1016.add(neighbor_1016);
                    visited_1016.add(neighbor_1016);
                }
            }
        }
        System.out.println();
    }
    // Main
    public static void main(String[] args) {
        GraphTraversal_2511531016 graph_1016 = new GraphTraversal_2511531016();
        // Contoh graf: A-B, A-C, B-D, B-E
        graph_1016.addEdge("A", "B");
        graph_1016.addEdge("A", "C");
        graph_1016.addEdge("B", "D");
        graph_1016.addEdge("B", "E");
        // Cetak graf awal
        System.out.println("Graf Awal adalah: ");
        graph_1016.printGraph();
        // Lakukan penelusuran
        graph_1016.dfs("A");
        graph_1016.bfs("A");
    }
}