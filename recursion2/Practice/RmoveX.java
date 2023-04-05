package recursion2.Practice;

import org.xml.sax.InputSource;

public class RmoveX {
    public static String remove(String input){
        if(input.length() <=1){
            return input;
        }

        // String ans = "";
        // if(input.charAt(0) != 'x'){
        //     ans = ans + input.charAt(0);
        // }

        // String smallAns = remove(input.substring(1));
        // return ans + smallAns;

        //anohter appraoch
        if(input.charAt(0) == 'x'){
            return remove(input.substring(1));
        }
        return input.charAt(0) + remove(input.substring(1));
    }

    public static void main(String[] args) {
        String test = "xxxxa";
        System.out.println(remove(test));
    }
}
