import java.util.*;


public class prime {
    public static boolean isPrime(int n){
        int d =2;
        while(d<n){
            if(n%d==0){
                return false;
            }
            d++;
        }
        return true;
    }   

    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }
}
