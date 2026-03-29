package mod14;

import java.util.*;

public class CountEdgesVertices {
    public static void main(String[] args) {

        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Undirected edges
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        int edges = 0;

        for (int i = 0; i < V; i++) {
            edges += adj.get(i).size();
        }

        edges = edges / 2; // because undirected

        System.out.println("Vertices = " + V);
        System.out.println("Edges = " + edges);
    }
}
