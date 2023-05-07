package recursion2.revision;

public class ReplaceChar {

    public static String replace(String str, char a, char b){
        if(str.length() == 0){
            return str;
        }

        String ans = "";
        if(str.charAt(0) == a){
            ans = ans + b;
        }else{
            ans = ans + str.charAt(0);
        }

        String smallAns = replace(str.substring(1), a, b);
        return ans + smallAns;

    }

    public static void main(String[] args) {
        String s = "abab";
        System.out.println(replace(s, 'a', 'x'));
    }
}
