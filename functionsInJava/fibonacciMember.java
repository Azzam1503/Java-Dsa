import java.util.*;

public class fibonacciMember {
    public static boolean checkMember(int n){
        int a=0;
        int b=1;
        int c;
        while(a <n){
            c = a+b;
            a = b;
            b = c;
        }
        if(a==n){
            return true;
        }else{
            return false;
        }
    }  
    
    public static void main(String[] args) {
        
       System.out.println(checkMember(5));
    }
}
