package graphs.revision;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        System.out.println("Enter the number of vertices");
        int vertices = s.nextInt();
        System.out.println("Enter the number of edges");
        int edges = s.nextInt();
        for (int i = 0; i <= vertices; i++)
            adj.add(new ArrayList<>());
        for (int i = 1; i <= edges; i++) {
            System.out.println("Enter the vertex 1");
            int v1 = s.nextInt();
            System.out.println("Enter the vertex 2");
            int v2 = s.nextInt();
            adj.get(v1).add(v2);
            adj.get(v2).add(v1);
        }
        s.close();
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
