package recursion;

public class Factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }

        int smallAns = fact(n-1);
        return smallAns * n;
    }

    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }
}
