//Print this pattern:
// Sample Input 2:
// 7
// Sample Output 2:
// G
// FG
// EFG
// DEFG
// CDEFG
// BCDEFG
// ABCDEFG

import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        int i = 1;
        int val = 1;
        while(i<=n){
            int j=1;
            val = n;
            while(j<=i){
                char jthCharacter = (char)('A'+ val-i);
                System.out.print(jthCharacter);
                val++;
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}