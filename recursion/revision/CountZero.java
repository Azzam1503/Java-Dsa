package recursion.revision;

public class CountZero {
    public static int count(int n){
        if(n==0){
            return 0;
        }

        int smallAns = count(n/10);
        if(n%10 == 0){
            return smallAns + 1;
        }
        return smallAns;
    }

    public static void main(String[] args) {
        System.out.println(count(200));
        System.out.println(20%10);
    }
}
