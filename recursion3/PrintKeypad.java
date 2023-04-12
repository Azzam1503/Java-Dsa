package recursion3;

public class PrintKeypad {
    public static String[] getString(int n){
        if(n<=1 || n>10){
         System.exit(0);
        }
 
        if(n==2){
         String[] output = {"a", "b", "c"};
         return output;
        }
        if(n==3){
         String[] output = {"d", "e", "f"};
         return output;
        }
 
        if(n==4){
         String[] output = {"g", "h", "i"};
         return output;
        }
 
        if(n==5){
         String output[] = {"j", "k", "l"};
         return output;
        }
        if(n==6){
         String output[] = {"m", "n", "o"};
         return output;
        }
 
        if(n==7){
         String output[] = {"p", "q", "r", "s"};
         return output;
        }
 
        if(n==8){
         String output[] = {"t", "u", "v"};
         return output;
        }
        else{
         String[] output = {"w", "x", "y","z"};
         return output;
        }
    }

    public static void print(int n, String output){
        if(n==0){
            System.out.println(output);
            return;
        }

        int lastDigit = n%10;
        int smallNumber = n/10;
        String[] lastDigitOptions = getString(lastDigit);
        for(int i=0; i<lastDigitOptions.length; i++){
            print(smallNumber, lastDigitOptions[i] + output);
        }
    }

    public static void main(String[] args) {
        print(23, "");
    }
}
