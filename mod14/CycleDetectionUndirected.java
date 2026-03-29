package mod14;


import java.util.*;

public class CycleDetectionUndirected {

    static boolean dfsCycle(int node, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {

        visited[node] = true;

        for (int neigh : adj.get(node)) {

            if (!visited[neigh]) {
                if (dfsCycle(neigh, node, visited, adj)) return true;
            } else if (neigh != parent) {
                return true;
            }
        }
        return false;
    }

    static boolean hasCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfsCycle(i, -1, visited, adj)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int V = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Undirected cycle 0-1-2-0
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(0);
        adj.get(0).add(2);

        System.out.println("Cycle Present? " + hasCycle(V, adj));
    }
}

