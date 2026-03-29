package mod14;


import java.util.*;

public class PrintNeighbors {
    public static void main(String[] args) {

        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(0).add(4);

        int node = 0;

        System.out.println("Neighbors of node " + node + ":");
        System.out.println(adj.get(node));
    }
}
