import java.util.ArrayList;
import java.util.HashMap;

import linkedList.Node;


public class prac {

    public static int permutation(String str){
        int len = str.length();
        int dp[][] = new int[len][len];

        for(int g=0; g<dp.length; g++){
            for(int i=0, j=g; j<dp.length; j++, i++){
                if(g==0){
                    dp[i][j] = 1;
                }else if(g==1){
                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] =  2;
                    }else{
                        dp[i][j] = 1;
                    }
                }else{
                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] = dp[i+1][j-1] + 2;
                    }else{
                        dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                    }
                }
            }
        }
        return dp[0][len-1];
    }

    private static void dfs(int image[][], int sr, int sc, int newColor, int prevColor, int grid[][], int n, int m){
        if(sr < 0 || sr >=n || sc < 0 || sc >= m || grid[sr][sc] != prevColor){
            return;
        }
        
        if(grid[sr][sc] == prevColor){
            grid[sr][sc] = newColor;
        }

        dfs(image, sr+1, sc, newColor, prevColor, grid, n, m);
        dfs(image, sr-1, sc, newColor, prevColor, grid, n, m);
        dfs(image, sr, sc+1, newColor, prevColor, grid, n, m);
        dfs(image, sr, sc-1, newColor, prevColor, grid, n, m);
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {   
        // Code here 
        int n =  image.length;
        int m = image[0].length;
        int grid[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                grid[i][j] = image[i][j];
            }
        }
        
        int prevColor = image[sr][sc];
        dfs(image, sr, sc, newColor, prevColor, grid, n, m);
        
        return grid;
    }

    public static void main(String[] args) {
        int image[][] = {{2, 3, 2, 1, 2} ,{3, 3, 3, 3, 1}, {3, 1, 1, 1, 2}, {1, 2, 2, 1, 3}, {1, 2, 3, 3, 1}, {2, 1, 2, 2, 2}, {1, 2, 2, 1, 1}, {3, 1, 1, 1, 2}};
        // int image[][] = {{1, 1, 1} ,{1, 1, 0}, {1, 0, 1}};
        
        int ans[][] = floodFill(image, 4, 0, 1);

        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
