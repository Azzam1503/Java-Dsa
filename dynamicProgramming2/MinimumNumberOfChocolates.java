package dynamicProgramming2;

public class MinimumNumberOfChocolates {
    public static int minNum(int arr[]){
        int n = arr.length;
        int dp[] = new int[n+1];

        dp[0] = 1;

        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]){
                dp[i] = dp[i-1] + 1;
            }else{
                dp[i] =1;
            }
        }

        for(int j=n-2; j>=0; j--){
            if(arr[j] > arr[j+1] && dp[j] <= dp[j+2]){
                dp[j] = dp[j+1] + 1;
            }
        }
        int sum = 0;
        
        for(int i = 0; i<n; i++)
            sum += dp[i];
        
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 4, 6};
        System.out.println(minNum(arr));
    }
}
