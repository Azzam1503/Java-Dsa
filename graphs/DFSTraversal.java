package graphs;

import java.util.Scanner;

public class DFSTraversal {

    public static void dfsHelper(int[][] graph, int currnetVertex, boolean[] visited){
        System.out.print(currnetVertex + " ");
        visited[currnetVertex] = true;
        for(int i=0; i<graph.length; i++){
            if(graph[currnetVertex][i] == 1 && visited[i] == false){
                dfsHelper(graph, i, visited);
            }
        }
    }

    public static void dfs(int graph[][]){
        boolean visited[] = new boolean[graph.length];
       
        for(int i=0; i<graph.length; i++){
            if(! visited[i]){
                dfsHelper(graph, i, visited);;
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        int graph[][] = new int[n][n];

        for (int i = 0; i < e; i++) {
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        graph[v1][v2] = 1;
        graph[v2][v1] = 1;

        }
        sc.close();
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
        System.out.print(graph[i][j] + " ");
        }
        System.out.println();
        }

        dfs(graph);
    }
}
