package recursion.revision;

public class CalPower {
    public static int power(int x, int n){
        // if(n==0){
        //     return 1;
        // }

        // if(n==1){
        //     return x;
        // }

        // return x * power(x, n-1);

        //Second approach

        if(n==0 && x==0){
            return 0;
        }

        if(x==0){
            return 0;
        }

        if(n==0){
            return 1;
        }

        int smallAns = power(x, n/2);

        if(n%2 == 0){
            return smallAns * smallAns;
        }else{
            return x*smallAns*smallAns;
        }

    }

    public static void main(String[] args) {
        System.out.println(power(3, 4));
    }
}
