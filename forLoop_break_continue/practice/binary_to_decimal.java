import java.util.*;

public class binary_to_decimal{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");
     int n = sc.nextInt();
        int decimal = 0, pow = 1;
        while(n>0){
            int lastDigit = n%10;
            decimal = decimal + lastDigit * pow;
            pow = pow * 2;
            n = n/10;
        } 
        System.out.println(decimal);
        sc.close();
    }
}