package recursion3.revision;

public class ReturnAllCodes {
    
    public static char getChar(int n){
        return (char)(96+n);
    }

    public static String[] getCode(String str){
        if(str.length() == 0){
            String[] output = {""};
            return output;
        }

        int firstDigit = (str.charAt(0)-'0');
        String[] smallAns1 = getCode(str.substring(1));
        String[] smallAns2 = new String[0];

        int firstTwoDigits = 0;
        if(str.length() >=2){
            firstTwoDigits = (str.charAt(0)-'0')*10 + (str.charAt(1)-'0');
            if(firstTwoDigits >=10 || firstTwoDigits <=26){
                smallAns2 = getCode(str.substring(2));
            } 
        }

        String[] output = new String[smallAns1.length + smallAns2.length];
        int k=0;

        for(String s : smallAns1){
            char firstDigitChar = getChar(firstDigit);
            output[k] = firstDigitChar + s;
            k++;
        }

        for(String s : smallAns2){
            char firstTwoDigitsChar = getChar(firstTwoDigits);
            output[k] = firstTwoDigitsChar + s; 
            k++; 
        }

        return output;
    }

    public static void main(String[] args) {
        String[] get = getCode("1123");

       for(int i=0; i<get.length; i++){
        System.out.println(get[i]);
       }
       
    }
}
