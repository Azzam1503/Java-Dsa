import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;

        System.out.println(0);
        System.out.println(1);
        while(a+3<n){
            c = a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
