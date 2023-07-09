package dynamicProgramming2;

public class MagicGrid {
    public static int magicGrid(int grid[][]){
       
        int n = grid.length;
        int m = grid[0].length;
        int dp[][] = new int[n+1][m+1];

        for(int i=0; i < dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }


        dp[n][m-1] = 1;
        dp[n-1][m] = 1;

        for(int i=n-1; i>=0; i--){
            for(int j = m-1; j>=0; j--){
                int neededStrength = Math.min(dp[i+1][j], dp[i][j+1]) - grid[i][j];
                dp[i][j] = (neededStrength<=0)?1:neededStrength;
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        int grid[][] = {
            {0, -2, -3, 1},
            {-1, 4, 0, -2},
            {1, -2, -3, 0}
        };

        int ans = magicGrid(grid);
        System.out.println(ans);
    }
    
}
