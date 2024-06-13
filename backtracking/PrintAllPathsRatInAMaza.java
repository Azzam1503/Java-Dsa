package backtracking;

public class PrintAllPathsRatInAMaza {
    public static void ratInMaze(int maze[][]){
        int n = maze.length;
        int[][] path = new int[n][n];
        printAllPaths(maze, 0, 0, path);
    }


    public static void printAllPaths(int maze[][], int i, int j, int[][] path){
        int n = maze.length;
        if(i < 0 || i >= n ||  j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1){
            return;
        }

        path[i][j] = 1;

        if(i == n-1 && j == n-1){
            for(int r = 0; r < n; r++){
                for(int k=0; k<n; k++){
                    System.out.print(path[r][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
            path[i][j] = 0;
            return;
        }

        printAllPaths(maze, i-1, j, path);
        printAllPaths(maze, i, j+1, path);
        printAllPaths(maze, i+1, j, path);
        printAllPaths(maze, i, j-1, path);

        path[i][j] = 0;

    }

    // public static void printAllPaths(int maze[][], int i, int j, int[][] path){
    //     if(i<0 || i>=maze.length || j<0 || j>=maze.length || maze[i][j] == 0 || path[i][j] == 1){
    //         return;
    //     }

    //     path[i][j] = 1;
    //     if(i == maze.length-1 && j == maze.length -1){
    //         for(int r =0; r<path.length; r++){
    //             for(int c=0; c<path.length; c++){
    //                 System.out.print(path[r][c]);
    //             }
    //             System.out.println();
    //         }
    //         System.out.println();
    //         path[i][j] = 0;
    //         return;
    //     }

    //     printAllPaths(maze, i-1, j, path);
    //     printAllPaths(maze, i, j+1, path);
    //     printAllPaths(maze, i+1, j, path);
    //     printAllPaths(maze, i, j-1, path);

    //     path[i][j]=0;
    //     return;
    // }

    public static void main(String[] args) {
        int maze[][] = {{1, 1, 0}, {1, 1, 0}, {1,1,1}};
        ratInMaze(maze);
    }
}
