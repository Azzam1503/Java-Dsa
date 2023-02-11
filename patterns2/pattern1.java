import java.util.*;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int i = 1;
        while(i<=n){
            int j = 1;
            int p = n;
            while(j<=n){
                System.out.print(p); // or n-j+1 instead of p
                p--;
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
