package dynamicProgramming2;

public class MinimumCostPath {
    public static int minCostIterTB(int path[][]){
        int n = path.length;
        int m = path[0].length;

        int dp[][] = new int[n+1][m+1];
        
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }


        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i == 1 && j ==1){
                    dp[i][j] = path[0][0];
                    continue;
                }

                int ans1 = dp[i-1][j];
                int ans2 = dp[i][j-1];
                int ans3 = dp[i-1][j-1];
                dp[i][j] = path[i-1][j-1] + Math.min(Math.min(ans1, ans2), ans3);
            }
        }
        return dp[n][m];
    }

    public static int minCostIterBT(int path[][]){
        int n = path.length;
        int m = path[0].length;

        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }


        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                if(i== n-1 && j  == m-1){
                    dp[i][j] = path[i][j];
                    continue;
                }
                int ans1 = dp[i+1][j];
                int ans2 = dp[i][j+1];
                int ans3 = dp[i+1][j+1];
                dp[i][j] = path[i][j] + Math.min(Math.min(ans1, ans2), ans3);
            }  
        }

        return dp[0][0];
    }

    public static int minCost(int[][] path, int i, int j, int[][] dp){
        int n = path.length;
        int m = path[0].length;

        if(i == n-1 && j == m-1){
            return path[i][j];
        }

        if( i >= n || j >=m){
            return Integer.MAX_VALUE;
        }
        
        int ans1, ans2, ans3;
        if(dp[i+1][j] == Integer.MIN_VALUE){
            ans1 = minCost(path, i+1, j, dp);
            dp[i+1][j] = ans1;
        }else{
            ans1 = dp[i+1][j];
        }

        if(dp[i][j+1] == Integer.MIN_VALUE){
            ans2 = minCost(path, i, j+1, dp);
            dp[i][j+1] = ans2;
        }else{
            ans2 = dp[i][j+1];
        }

        if(dp[i+1][j+1] == Integer.MIN_VALUE){
            ans3 = minCost(path, i+1, j+1, dp);
            dp[i+1][j+1] = ans3;
        }else{
            ans3 = dp[i+1][j+1];
        }

        int ans = path[i][j] + Math.min(Math.min(ans1, ans2), ans3);
        return ans;
        
    }

    public static void main(String[] args) {
        int path[][] = {
            {1, 5, 11},
            {8, 13, 12},
            {2, 3, 7},
            {15, 16, 18}
        };

        int dp[][] = new int[path.length+1][path[0].length+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = Integer.MIN_VALUE;
            }
        }
        int ans = minCost(path, 0, 0, dp);
        int ans2 = minCostIterBT(path);
        int ans3 = minCostIterTB(path);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }
}


