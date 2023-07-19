package graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class GetPathDFS {
    public static ArrayList<Integer> getPathDFS(int graph[][], int sv,int  ev){
        boolean[] visited = new boolean[graph.length];
        ArrayList<Integer> output = getPathDFSHelper(graph, sv, ev, visited);
        return output;
    }

    public static ArrayList<Integer> getPathDFSHelper(int graph[][], int sv, int ev, boolean[] visited){
        if(sv == ev){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(ev);
            return output;
        }

        visited[sv] = true;
        for(int i=0; i<graph.length; i++){
            if(graph[sv][i] == 1 && !visited[i]){
                ArrayList<Integer> smallOutput = getPathDFSHelper(graph, i, ev, visited);
                if(smallOutput != null){
                    smallOutput.add(sv);
                    return smallOutput;
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int graph[][] = new int[n][n];
        for(int i=0;i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            graph[v1][v2] = 1;
            graph[v2][v1] = 1;
        }

        for(int i=0; i<n; i++){
            for(int j=0;j<n; j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

        int sv = sc.nextInt();
        int ev = sc.nextInt();
        ArrayList<Integer> path = getPathDFS(graph, sv, ev);
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
        sc.close();
    } 
}
