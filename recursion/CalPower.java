package recursion;

public class CalPower {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        // if(x==0 && n==0){
        //     return 1;
        // }
        // if(x==0){
        //     return 0;
        // }
        // if(n==0){
        //     return 1;
        // }

        // int smallAns = power(x, n/2);
        // if(n%2==0){
        //     return smallAns * smallAns;
        // }else{
        //     return x * smallAns * smallAns;
        // }
        return x * power(x, n-1);
    }

    public static void main(String[] args) {
        int ans = power(5, 4);

        System.out.println(ans);
    }
}
