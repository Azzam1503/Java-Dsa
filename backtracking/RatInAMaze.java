package backtracking;

public class RatInAMaze {

    public static boolean ratInMaze(int[][] maze){
        int n = maze.length;
        int[][] path = new int[n][n];
        return solveMaze(maze, 0, 0, path);
    }

    public static boolean solveMaze(int[][] maze, int i, int j, int[][] path){

        //check if cell is valid or not 
        if(i<0 || i>= maze.length || j<0 || j>=maze.length || maze[i][j] == 0 || path[i][j] == 1){
            return false;
        }
        
        //Include the cell in current path 
        path[i][j] = 1;
        if(i == maze.length -1 && j == maze.length-1){
            for(int r =0; r<path.length; r++){
                for(int c = 0; c<path.length; c++){
                    System.out.print(path[r][c]+ " ");
                }
                System.out.println();
            }
            return true;
        }

        //Explore further in all directions

        //top
        if(solveMaze(maze, i-1, j, path)){
            return true;
        }

        //right
        if(solveMaze(maze, i, j+1, path)){
            return true;
        }

        //Bottom
        if(solveMaze(maze, i+1, j, path)){
            return true;
        }

         //left
         if(solveMaze(maze, i, j-1, path)){
            return true;
        }

        return false;
        
    }

    public static void main(String[] args) {
        int maze[][] = {{1, 1, 0}, {1, 1, 0}, {1,1,0}};
        boolean pathPossible = ratInMaze(maze);
        System.out.println(pathPossible);
    }
}
