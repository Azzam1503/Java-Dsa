//Print this pattern:
// 1
// 21
// 321
// 4321
// 54321
// 654321

import java.util.*;

public class pattern7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int j =1;
            int p = i;
            while(j<=i){
                System.out.print(p);
                p--;
                j++;
            }
            System.out.println(" ");
            i++;
        }

    }
}
