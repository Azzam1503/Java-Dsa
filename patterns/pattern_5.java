import java.util.*;

public class pattern_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        
        // int i = 1;
        // while(i<=n){
        //     int space = 1;
        //     while(space <= n - i){
        //         System.out.print(" ");
        //         space++;
        //     }

        //     int j = 1;
        //     while(j<= 2*i-1){
        //         System.out.print("*");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        for(int i=1; i<=n; i++){
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}