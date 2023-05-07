package recursion.revision;

public class CheckPalindrome {
    public static boolean check(String str, int start, int end){
        if(start>=end){
            return true;
        }

        if(str.charAt(start) == str.charAt(end)){
            return check(str, start+1, end-1);
        }else{
            return false;
        }

    }

    public static boolean check(String str){
        return check(str, 0, str.length()-1);
    }

    public static boolean check2(String str){
        if(str.length() <= 1){
            return true;
        }

        if(str.charAt(0) == str.charAt(str.length()-1)){
            return check2(str.substring(1, str.length()-1));
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "aabbcbbaa";
        System.out.println(check(str));
        System.out.println(check2(str));
    }
}
