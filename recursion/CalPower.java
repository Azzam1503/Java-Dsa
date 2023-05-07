package recursion;

public class CalPower {
    public static int power(int x, int n){
        if(x==0 && n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        int smallAns = power(x, n/2);
        if(n%2==0){
            return smallAns * smallAns;
        }else{
            return x * smallAns * smallAns;
        }
        
    }

    public static void main(String[] args) {
        int ans = power(3, 4);

        System.out.println(ans);
        System.out.println(4%2);
    }
}
