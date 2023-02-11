//Print this pattern:
// A
// BB
// CCC
// DDDD
import java.util.*;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int j=1;
            while(j<=i){
                char jthCharacter = (char)('A'+i-1);
                System.out.print(jthCharacter);
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}
