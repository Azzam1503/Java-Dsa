package graphs;

import java.util.Scanner;

public class Dijkstra {
    public static int findMinVertex(int distance[], boolean[] visited){
        int minVertex = -1;
        for(int i=0; i<visited.length; i++){
            if(!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])){
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static void dijkstra(int grpah[][], int n){
        boolean visited[] = new boolean[n];
        int distance[] = new int[n];
        distance[0] = 0;

        for(int i=1; i<n; i++){
            distance[i] = Integer.MAX_VALUE;
        }

        for(int i=0; i<n-1; i++){
            int minVertex = findMinVertex(distance, visited);
            visited[minVertex] = true;

            for(int j=0; j<n; j++){
                //j is neightbour of minVertex
                if(grpah[minVertex][j] > 0 && !visited[j] && grpah[minVertex][j] < Integer.MAX_VALUE){
                    int newDistance = distance[minVertex] + grpah[minVertex][j];
                    if(newDistance < distance[j]){
                        distance[j] = newDistance;
                    } 
                }
            }
        }

        //Print
        for(int i=0; i<n; i++){
            System.out.println(i + " " + distance[i]);
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

        dijkstra(graph, n);
    }
}
