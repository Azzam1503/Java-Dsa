package recursion3.revision;

public class ReturnKeypad {
    public static String[] getString(int x){
        if(x<=1 || x>=10){
            System.exit(0);
        }
        if(x == 2){
            String[] output = {"a", "b", "c"};
            return output;
        }else if(x == 3){
            String[] output = {"d", "e", "f"};
            return output;
        }else if(x == 4){
            String[] output = {"g", "h", "i"};
            return output;
        }else if(x == 5){
            String[] output = {"j", "k", "l"};
            return output;
        }else if(x == 6){
            String[] output = {"m", "n", "o"};
            return output;
        }else if(x == 7){
            String[] output = {"p", "q", "r", "s"};
            return output;
        }else if(x == 8){
            String[] output = {"t", "u", "v"};
            return output;
        }else{
            String[] output = {"w", "x", "y", "z"};
            return output;
        }
    }

    public static String[] keypad(int n){
        if(n==0){
            String[] output = {""};
            return output; 
        }


        int lastDigit = n%10;
        int smallDigit = n/10;

        String[] smallAns = keypad(smallDigit);
        String[] singleDigitArray = getString(lastDigit);

        String[] output = new String[smallAns.length * singleDigitArray.length];
        int k=0; 
        for(int i=0; i<smallAns.length; i++){
            for(int j=0; j<singleDigitArray.length; j++){
                output[k] = smallAns[i] + singleDigitArray[j];
                k++;
            }
        }

        return output;

    }

    public static void main(String[] args) {
        String[] str = keypad(234);
        for(int i=0; i<str.length; i++){
            System.out.println(str[i]);
        }
    }


}
