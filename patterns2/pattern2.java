// print this pattren:
// 1
// 12
// 123
// 1234

import java.util.*;

public class pattern2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        // int i = 1;
        // while(i<=n){
        //     int j = 1;
        //     while(j<=i){
        //         System.out.print(j);
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
    }
}
