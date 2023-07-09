package dynamicProgramming2;

public class MaximumSquareMatrixWithAllZero {
    public static int maxSquare(int arr[][]){

        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int m = arr[0].length;
        int[][] dp = new int[m][n];

        for(int i=0; i<arr[0].length; i++){
                if(arr[0][i] == 0){
                    dp[0][i] = 1;
                }else{
                    dp[0][i] = 0; 
                }
        }

        for(int j=0; j<arr.length; j++){
                if(arr[j][0] == 0){
                    dp[j][0] = 1;
                }else{
                    dp[j][0] = 0; 
                }
        }

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(arr[i][j] == 0){
                    int ans1 = dp[i-1][j-1];
                    int ans2 = dp[i-1][j];
                    int ans3 = dp[i][j-1];

                    dp[i][j] = Math.min(Math.min(ans1, ans2), ans3) +1;
                    if(dp[i][j] > max){
                        max = dp[i][j];
                    }
                }else{
                    dp[i][j] = 0;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[][] = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        };

        int ans = maxSquare(arr);
        System.out.println(ans);

        int kits = ((2*5)/4)+ ((2*5)%4);
        System.out.println(kits);
    }
}
