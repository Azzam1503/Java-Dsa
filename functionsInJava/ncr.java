

public class ncr {
    public static int factorial(int n){
        int ans =1 ;
        for (int i = 1; i <=n; i++) {
            ans = ans * i;
        }
        return ans;
    }   
    
    public static int ncr(int n, int r){
        int ans = factorial(n)/(factorial(r)*factorial(n-r));
        return ans;
    };

    public static void main(String[] args) {
        System.out.println(ncr(6, 3));
    }
}
