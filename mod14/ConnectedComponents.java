package mod14;


import java.util.*;

public class ConnectedComponents {

    static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;

        for (int neigh : adj.get(node)) {
            if (!visited[neigh]) {
                dfs(neigh, visited, adj);
            }
        }
    }

    static int countComponents(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                count++;
                dfs(i, visited, adj);
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Component 1
        adj.get(0).add(1);
        adj.get(1).add(0);

        // Component 2
        adj.get(2).add(3);
        adj.get(3).add(2);

        // Component 3
        adj.get(4).add(5);
        adj.get(5).add(4);

        System.out.println("Connected Components = " + countComponents(V, adj));
    }
}