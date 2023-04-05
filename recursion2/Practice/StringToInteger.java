package recursion2.Practice;

public class StringToInteger {
    public static int convert(String str){
        if(str.length()==1){
            return str.charAt(0) - '0';
        }

        int smallAns = convert(str.substring(0, str.length()-1));
        int lastDigit = str.charAt(str.length()-1) -'0';
        return (smallAns*10) + lastDigit;

    }

    public static void main(String[] args) {
        String s = "1237";
        int ab = convert(s);

        System.out.println(ab);
    }
}
