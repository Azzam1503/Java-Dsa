package dynamicProgramming2;

public class EditDistance {
    
    public static int editDistance(String s1, String s2, int dp[][]){
        if(s1.length() == 0){
            return s2.length();
        }

        if(s2.length() == 0){
            return s1.length();
        }

        int n = s1.length();
        int m = s2.length();

        if(dp[n][m] != -1){
            return dp[n][m];
        }
         
        if(s1.charAt(0) == s2.charAt(0)){
            int smallAns = editDistance(s1.substring(1), s2.substring(1), dp);
            dp[n-1][m-1] = smallAns;
            dp[n][m] = 0 + smallAns;

        }else{
            int remove = editDistance(s1.substring(1), s2, dp);
            dp[n-1][m] = remove;

            int insert = editDistance(s1, s2.substring(1), dp);
            dp[n][m-1] = insert;

            int substitue = editDistance(s1.substring(1), s2.substring(1), dp);
            dp[n-1][m-1] = substitue;

            dp[n][m] = 1 + Math.min(Math.min(insert, remove), substitue);
        }
        return dp[n][m];

    }

    public static void main(String[] args) {
        String s1 = "whgtdwhgtdg";
        String s2 = "aswcfg";

        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        
        int ans = editDistance(s1, s2, dp);
        System.out.println(ans);
    }
}
