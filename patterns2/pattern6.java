// print this pattern:
// 1  
// 22 
// 333 
// 4444 

import java.util.*;

public class pattern6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        //Using while loop
        // int i = 1;
        // while(i<=n){
        //     int j =1;
        //     while(j<=i){
        //         System.out.print(i);
        //         j++;
        //     }
        //     System.out.println(" ");
        //     i++;
        // }


            //using for loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
