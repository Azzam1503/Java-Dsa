import java.util.*;

public class reverseNumber{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");
     int n = sc.nextInt();
        int temp = n, revNum = 0;

        while(temp>0){
            int lastDigit = temp%10;
            temp = temp/10;

            revNum = revNum * 10 + lastDigit;
        };
        if(n==revNum){
            System.out.println("Number is Palindrome");
        }
        System.out.println(revNum);
        
    }
}