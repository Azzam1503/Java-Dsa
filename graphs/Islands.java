package graphs;

import java.util.Scanner;

public class Islands {
    public static void islandsHelper(int graph[][], int sv, boolean visited[]){
        visited[sv] = true; 

        for(int i=0; i<graph.length; i++){
            if(graph[sv][i] == 1 && !visited[i]){
                islandsHelper(graph, i, visited);
            }
        }
    }

    public static int islands(int graph[][], int sv, int ev){
        boolean visited[] = new boolean[graph.length];
        int count = 0; 
        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
               islandsHelper(graph, i, visited);
               count++;
            }
        }
        return count;
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
            System.out.print(graph[i][j]);
        }
        System.out.println();
    }

    int sv = sc.nextInt();
    int ev = sc.nextInt();
    int ans = islands(graph, sv, ev);

    System.out.println(ans);
    sc.close();
   }
}
