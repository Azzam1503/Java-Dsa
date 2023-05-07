package recursion.revision;

public class NumberOfDigit {
    public static int digitCount(int n){
        if(n==0){
            return 0; 
        }
        
        int smallAns = digitCount(n/10);
        return smallAns + 1;
    }

    public static void main(String[] args) {
        System.out.println(digitCount(40255));
    }
}
