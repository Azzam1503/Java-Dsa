import java.util.*;

public class pattern8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        //using while loop
        // int i = 1;
        // while(i<=n){
        //     int space=1;
        //     while(space<=n-i){
        //         System.out.print(" ");
        //         space++;
        //     }

        //     int j =1;
        //     while(j<=i){
        //         System.out.print(j);
        //         j++;
        //     }

        //     int dec=i-1;
        //     while(dec >=1){
        //         System.out.print(dec);
        //         dec--;
        //     }
        //     System.out.println(" ");
        //     i++;
        // }

            // Using for loop

        for(int i =1; i<=n; i++){
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            
            for(int dec=i-1; dec>=1; dec--){
                System.out.print(dec);
            }

            System.out.println();
        }

    }
}
