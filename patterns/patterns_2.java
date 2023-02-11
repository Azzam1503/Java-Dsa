import java.util.*;

public class patterns_2 {
public static void main(String[] args) {
    Scanner c = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n = c.nextInt();
    int i = 1;
    int val = 1;
    while(i<=n){
        int space = 1;
        while(space <= n-i){
            System.out.print(" ");
            space++;
        }

        int j =1;
        while(j<=i){
            System.out.print(val);
            val = val+1;
            j++;
        }
        System.out.println();
        i++;
    }
}
}
