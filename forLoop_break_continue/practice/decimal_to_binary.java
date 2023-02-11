import java.util.*;
public class decimal_to_binary {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");
     int n = sc.nextInt();
        int binary = 0, pow = 1;
        while(n>0){
            int lastBit = n%2;
            binary = binary + lastBit * pow;
            pow = pow * 10;
            n = n/2;
        } 
        System.out.println(binary);
    }
}

