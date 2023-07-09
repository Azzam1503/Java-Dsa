package dynamicProgramming;

import java.util.Scanner;

public class MinimumSquare {

    public static int minSqr2(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        
        for(int i = 1; i<=n; i++){
            int minAns = Integer.MAX_VALUE;
            for(int j=1; j*j<=i; j++){
                int currAns = dp[i-(j*j)];
                if(minAns > currAns){
                    minAns = currAns;
                }
            }
            dp[i] =  minAns +1;
        }
        return dp[n];
    }

    public static int minSqr(int n, int dp[]){
        if(n == 0){
            return 0;
        }
 
        int minAns = Integer.MAX_VALUE; 
        for(int i=1; i*i<=n; i++){
            int currentAns;
            if(dp[n - (i*i)] == -1){
                currentAns = minSqr(n - (i*i), dp);
                dp[n-(i*i)] = currentAns;
            }else{
                currentAns = dp[n-(i*i)];
            }
            if(minAns > currentAns){
                minAns = currentAns;
            }
        }

        int myAns = 1+minAns;
        return myAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int dp[]  = new int[n+1];

        // for(int i=0; i<dp.length; i++){
        //     dp[i] = -1;
        // }

        // int sqr = minSqr(n, dp);
        // System.out.println(sqr);
        System.out.println(minSqr2(n));
        sc.close();

        int arr[][] = {{1, 3, 4}, {2, 4, 5}, {5, 6, 7}, {1, 2, 3}};
        System.out.println(arr.length);
    }
}
