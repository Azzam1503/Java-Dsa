

import java.util.Scanner;
import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean prime = true;
        for(int d = 2; d<n; d++){
            if(n%d == 0){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }

    }
}
