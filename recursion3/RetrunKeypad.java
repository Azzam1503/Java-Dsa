package recursion3;

public class RetrunKeypad {
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
    public static String[] keypad(int n){
        if(n == 0){
            String output[] = {" "};
            return output;
        }

        String[] smallerNumberArray = keypad(n/10);
        String[] lastDigit = getString(n%10);
        String output[] = new String[lastDigit.length * smallerNumberArray.length];

        int k=0; 
        for(int i=0; i<lastDigit.length; i++){
            for(int j=0; j<smallerNumberArray.length; j++){
                output[k] = smallerNumberArray[j] + lastDigit[i];
                k++;
            }
        }

        return output;
        
    }
    public static void main(String[] args) {
        String[] arr = keypad(234);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
