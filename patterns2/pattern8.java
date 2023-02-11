import java.util.*;

public class pattern8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int space=1;
            while(space<=n-i){
                System.out.print(" ");
                space++;
            }

            int j =1;
            while(j<=i){
                System.out.print(j);
                j++;
            }

            int dec=i-1;
            while(dec >=1){
                System.out.print(dec);
                dec--;
            }
            System.out.println(" ");
            i++;
        }

    }
}
