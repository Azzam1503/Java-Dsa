package dynamicProgramming2;

public class LootHouses {
    public static int lootHouses(int[] arr){
        int n  = arr.length;
        int dp[] = new int[n];

        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for(int i=2; i<n; i++){
            dp[i] = Math.max(dp[i-1], (arr[i] + dp[i-2]));
        }

        return dp[n-1];
    }
    public static void main(String[] args) {
        int arr[] = {10, 2, 30, 20, 3, 50};
        int ans = lootHouses(arr);
        System.out.println(ans);
    }
}
