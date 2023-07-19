package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GetPathBFS {
    public static ArrayList<Integer> getPath(int graph[][], int start, int end) {
        Queue<Integer> pendingVertex = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean visited[] = new boolean[graph.length];
        visited[start] = true;
        pendingVertex.add(start);
        map.put(start, -1);
        boolean pathFound = false;

        while (!pendingVertex.isEmpty()) {
            int front = pendingVertex.poll();
            for (int i = 0; i < graph.length; i++) {
                if (graph[front][i] == 1 && !visited[i]) {
                    pendingVertex.add(i);
                    visited[i] = true;
                    map.put(i, front);
                    if (i == end) {
                        pathFound = true;
                        break;
                    }

                }
            }
        }

        if (pathFound) {
            ArrayList<Integer> path = new ArrayList<>();
            int currnetVertex = end;
            while (currnetVertex != -1) {
                path.add(currnetVertex);
                int parent = map.get(currnetVertex);
                currnetVertex = parent;
            }
            return path;
        } else {
            return null;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int graph[][] = new int[n][n];
        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            graph[v1][v2] =1;
            graph[v2][v1] =1;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

        ArrayList<Integer> path = getPath(graph, 0, 5);
        
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
        sc.close();

    }
}
