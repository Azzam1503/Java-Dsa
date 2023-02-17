// print this pattern:
// 1 
// 2 3 
// 3 4 5 
// 4 5 6 7 

import java.util.*;

public class pattern4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        // int i = 1;
        // int val = 1;
        // while(i<=n){
        //     int j = 1;
        //     val=i;
        //     while(j<=i){
        //         System.out.print(val + " ");
        //         val++;
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        // int val;
        for(int i=1; i<=n; i++){
            int val=i;
            for(int j=1; j<=i; j++){
                System.out.print(val +" ");
                val++;
            }
            System.out.println();
        }

    }
}