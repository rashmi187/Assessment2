package mod14;


import java.util.*;

public class ShortestPathBFS {

    static void shortestPath(ArrayList<ArrayList<Integer>> adj, int V, int src) {

        int[] dist = new int[V];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        dist[src] = 0;
        q.add(src);

        while (!q.isEmpty()) {

            int node = q.poll();

            for (int neigh : adj.get(node)) {
                if (dist[neigh] == -1) {
                    dist[neigh] = dist[node] + 1;
                    q.add(neigh);
                }
            }
        }

        System.out.println("Shortest distances from node " + src + ":");
        for (int i = 0; i < V; i++) {
            System.out.println(src + " -> " + i + " = " + dist[i]);
        }
    }

    public static void main(String[] args) {

        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(4);
        adj.get(4).add(5);

        shortestPath(adj, V, 0);
    }
}