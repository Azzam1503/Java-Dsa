package recursion3;

public class ReturnAllCodes {

    public static char getChar(int n){
        return (char)(96 + n);
    } 
    public static String[] allCodes(String input){
        if(input.length() == 0){
            String[] output = {" "};
            return output; 
        }

        int firstDigit = (input.charAt(0)-'0');
        String smallOutput[] = allCodes(input.substring(1));
        String smallOutput2[] = new String[0];

        int firstTwoDigits = 0;
        if(input.length() >= 2){
            firstTwoDigits = (input.charAt(0) - '0') *10 + (input.charAt(1) - '0');
            if(firstTwoDigits >= 10 && firstTwoDigits<=26){
                smallOutput2 = allCodes(input.substring(2));
            }
        }

        String[] output = new String[smallOutput.length + smallOutput2.length];

        int k=0;

        for(String s : smallOutput){
            char firstDigitChar = getChar(firstDigit);
            output[k] = firstDigitChar + s;
            k++;
        }

        for(String s : smallOutput2){
            char firstTwoDigitChar = getChar(firstTwoDigits);
            output[k] = firstTwoDigitChar + s;
            k++;
        }

        return output;
        
    }

    public static void main(String[] args) {
        String s = "1123";
        String[] output = allCodes(s);
        for(String a : output){
            System.out.println(s);
        }
    }
}
