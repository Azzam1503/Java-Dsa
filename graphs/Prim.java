package graphs;

import java.util.Scanner;

public class Prim {

    private static int findMinVertex(boolean[] visited, int[] weight) {
        int minVertex = -1;
        for(int i=0; i<visited.length; i++){
            if(!visited[i] && (minVertex == -1 || weight[i] < weight[minVertex])){
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static void prim(int graph[][], int n){
        boolean[] visited = new boolean[n];
        int weight[] = new int[n];
        int parent[] = new int[n];
        parent[0] = -1;
        weight[0] = 0;
        for(int i=1; i<n; i++){
            weight[i] = Integer.MAX_VALUE;
        }

        for(int i=0; i<n; i++){
            int minVertex = findMinVertex(visited, weight);
            visited[minVertex] = true;

            for(int j=0; j<n; j++){
                if(graph[minVertex][j] != 0 && !visited[j]){
                    if(weight[j] > graph[minVertex][j]){
                        weight[j] = graph[minVertex][j];
                        parent[j] = minVertex;
                    }
                }
            }
        }

        //print

        for(int i=0; i<n; i++){
            System.out.println(i + " " + parent[i] + " " + weight[i]);
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
            int weight = sc.nextInt();

            graph[v1][v2] = weight;
            graph[v2][v1] = weight;

        }
        
        prim(graph, graph.length);
        
    }
}
