package recursion.revision;

public class SumOfDigits {
    public static int sumOfDigit(int n){
        if(n<10){
            return n;
        }

        int sum = n%10;

        return sum + sumOfDigit(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigit(12345));
    }
}
