package dynamicProgramming2;

public class LCS {

    public static int lcsIter(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = 0;
            }
        }

        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                int ans;
                if(str1.charAt(i) == str2.charAt(j)){
                    ans = 1 + dp[i+1][j+1];
                }else{
                    int ans1 = dp[i][j+1];
                    int ans2 = dp[i+1][j];

                    ans = Math.max(ans1, ans2);
                }

                dp[i][j] = ans;
            }
        }

        return dp[0][0];
    }

    public static int lcsDP(String str1, String str2, int i, int j, int[][] dp){
        if(i == str1.length() || j == str2.length()){
            return 0;
        }

        int myAns;

        if(str1.charAt(i) == str2.charAt(j)){
            int smallAns;
            if(dp[i+1][j+1] == -1){
                smallAns = lcsDP(str1, str2, i+1, j+1, dp);
                dp[i+1][j+1] = smallAns;
            }else{
                smallAns = dp[i+1][j+1];
            }

            myAns = 1 + smallAns;
        }else{
            int ans1, ans2;

            if(dp[i+1][j] == -1){
                ans1 = lcsDP(str1, str2, i+1, j, dp);
                dp[i+1][j] = ans1;
            }else{
                ans1 = dp[i+1][j];
            }

            if(dp[i][j+1] == -1){
                ans2 = lcsDP(str1, str2, i, j+1, dp);
                dp[i][j+1]= ans2; 
            }else{
                ans2 = dp[i][j+1];
            }

            myAns = Math.max(ans1, ans2);
        }

        return myAns;
        
    }
    public static int lcs(String a, String b, int i, int j){
        if(i == a.length() || j == b.length()){
            return 0;
        }

        int myAns;

        if(a.charAt(i) == b.charAt(j)){
            int smallAns = lcs(a, b, i+1, j+1);
            myAns = 1 + smallAns;
        }else{
            int ans1 = lcs(a, b, i+1, j);
            int ans2 = lcs(a, b, i, j+1);
            myAns = Math.max(ans1, ans2);
        }

        return myAns;
    }

    public static void main(String[] args) {
        String s1 = "gc";
        String s2 = "gc";

        int dp[][] = new int[s1.length() + 1][s2.length() + 1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        int ans = lcsDP(s1, s2, 0, 0, dp);
        int ans2 = lcsIter(s1, s2);
        System.out.println(ans2);
    }
    
}
