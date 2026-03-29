package mod14;
import java.util.*;

public class DFSTraversal {

    static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int node) {

        visited[node] = true;
        System.out.print(node + " ");

        for (int neigh : adj.get(node)) {
            if (!visited[neigh]) {
                dfs(adj, visited, neigh);
            }
        }
    }

    public static void main(String[] args) {

        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Directed edges
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(4);
        adj.get(4).add(5);

        boolean[] visited = new boolean[V];

        System.out.println("DFS Traversal:");
        dfs(adj, visited, 0);
    }
}



