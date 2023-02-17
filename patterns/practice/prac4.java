import java.util.*;

public class prac4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int i = 1;
        int ans=1;
        while(i <= n){
            ans = ans*x;
            i++;
        }
        System.out.println(ans);
           
    }
}
