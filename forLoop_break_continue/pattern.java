import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =4;
        for(int i=1; i<=n; i++){
            for(int j =1; j<=n; j++){
                System.out.print(j +" ");

                if(j==i){
                    break;
                }
            }
            System.out.println();
        }
    }
}
