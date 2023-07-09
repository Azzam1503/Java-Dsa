package dynamicProgramming2;

public class Knapsack {
    public static int knapsackIter(int W, int weight[], int value[]){
        int n = value.length;
        int dp[][] = new int[n+1][W+1];

        for(int i=n-1; i>=0; i--){
            for(int w=0; w<=W; w++){
                int ans;
                if(weight[i] <= w){
                    int ans1 = value[i] + dp[i+1][w - weight[i]];
                    int ans2 = dp[i+1][w];
                    ans = Math.max(ans1, ans2);
                }else{
                    ans = dp[i+1][w];
                }
                dp[i][w] = ans;
            }
        }

        return dp[0][W];
    }
    public static int knapSack(int w, int weight[], int[] value, int i){

        if(i == weight.length){
            return 0;
        }
        int ans;
        if(weight[i] <= w){
            int ans1 = value[i] + knapSack(w-weight[i], weight, value, i+1);
            int ans2 = knapSack(w, weight, value, i+1);
            ans = Math.max(ans1, ans2);
        }else{
            ans = knapSack(w, weight, value, i+1);
        }
        return ans;
    }


    public static void main(String[] args) {
        int val[] = {200, 300, 100};
        int wt[] = {20, 25, 30};
        int w = 50;

        int ans = knapSack(w, wt, val, 0);
        int ans2 = knapsackIter(w, wt, val);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
