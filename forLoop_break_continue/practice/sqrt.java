import java.util.*;

public class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int output = 1;
        while(output*output<=n){
            output++;
        }
        output--;
        System.out.println(output);
    }    
}
