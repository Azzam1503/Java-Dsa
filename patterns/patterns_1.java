import java.util.*;


public class patterns_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = s.nextInt();
        int i =1;
        int val =1;
        // while(i<=n){
        //     int j = 1;
        //     while(j <= i){
        //         System.out.print(val+" ");
        //         val++;
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        for(i=1; i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }
    }
}
