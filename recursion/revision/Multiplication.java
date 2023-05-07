package recursion.revision;

public class Multiplication {
    public static int product(int n, int x){
        if(x == 0){
            return 0;
        }

        return n + product(n, x-1);
    }

    public static void main(String[] args) {
        System.out.println(product(2, 3));
    }
}
