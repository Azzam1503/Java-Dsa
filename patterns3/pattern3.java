//Print this pattern:
// A
// BC
// CDE
// DEFG
// EFGHI
// FGHIJK

import java.util.*;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        int i = 1;
        int val = 1;
        while(i<=n){
            int j=1;
            val = i;
            while(j<=i){
                char jthCharacter = (char)('A'+ val-1);
                System.out.print(jthCharacter);
                val++;
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}
