import java.util.*;

//Print this pattern:
// ABCD
// ABCD
// ABCD
// ABCD
public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int j=1;
            while(j<=n){
                char jthCharacter = (char)('A'+j-1);
                System.out.print(jthCharacter);
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}
