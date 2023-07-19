package graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSTraversal {

    public static void bfs(int[][] graph){
        Queue<Integer> pendingVertex = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        pendingVertex.add(0);
        visited[0] = true;
        
        for(int k=0; k<graph.length; k++){
            if(!visited[k]){
                while(!pendingVertex.isEmpty()){
                    int front = pendingVertex.poll();
                    System.out.print(front + " ");
                    for(int i=0; i<graph.length; i++){
                        if(graph[front][i] == 1 && visited[i] == false){
                            pendingVertex.add(i);
                            visited[i] = true;
                        }
        
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int graph[][] = new int[n][n];
        for(int i=0; i<e;i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            graph[v1][v2] = 1;
            graph[v2][v1] = 1;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

        bfs(graph);

        sc.close();
    }
}
