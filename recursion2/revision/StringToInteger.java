package recursion2.revision;

public class StringToInteger {

    public static int tranform(String str){
        if(str.length ()== 1){
            return str.charAt(0) - '0';
        }

        int smallAns = tranform(str.substring(0, str.length()-1));
        int lastDigit = str.charAt(str.length()-1) - '0';
        return smallAns*10 + lastDigit;

    }

    public static void main(String[] args) {
        String str = "1234";
        System.out.println(tranform(str));
    }
}
