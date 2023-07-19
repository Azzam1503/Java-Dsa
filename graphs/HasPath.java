package graphs;
import java.util.Scanner;

public class HasPath {

   public static boolean hasPathHelper(int graph[][], int s, int e, boolean[] visited){
    
    if(s == e){
        return true;
    }

    visited[s] = true;

    for(int i=0; i<graph.length; i++){
        if(graph[s][i] == 1 && visited[i]==false){
            return hasPathHelper(graph, i, e, visited);
        }
    }
    return false;
   }

    public static boolean hasPath(int graph[][], int s, int e){
        boolean[] visited = new boolean[graph.length];
            return hasPathHelper(graph, s, e, visited);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int e = sc.nextInt();

        int graph[][] = new int[n][n];
        for(int i=0; i<e; i++){
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
        
        System.out.println(hasPath(graph, 2, 3));
        sc.close();
    }
}
