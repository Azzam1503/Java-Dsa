import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        int i = 1; 
        int val = 1;
        // while(i <= n ){
            
        //     int space = 0;
        //     while(space <= n-i){
        //         System.out.print(" ");
        //         space++;
        //     }
            
        //     int j = 1;
        //     while(j<=i){
        //         System.out.print(val);
        //         val++;
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        while(i<=n){
            int space = 0;
            while(space<n-i){
                System.out.print(" ");
                space++;
            }
            int j = 1;
            while(j<=(2*i)-1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
