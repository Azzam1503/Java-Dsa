package graphs;

import java.util.Scanner;

public class CycleCount {
    public static int cycle(int[][] graph, int n){
        int count =0;

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(graph[i][j] == 1 && graph[j][k] == 1 && graph[k][i] == 1){
                        count++;
                    }
                }
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
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

        int ans = cycle(graph, graph.length);
        System.out.println(ans);
    }
}
