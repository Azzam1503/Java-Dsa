import java.util.*;

public class factorial {

    public static int factorial(int n){
        int ans = 1;
        for (int i = 1; i <=n ; i++) {
            ans = ans * i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        System.out.println("Enter the value of R");
        int r = sc.nextInt();

        int ans = factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println(ans);
    }
}
