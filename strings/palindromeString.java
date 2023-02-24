package strings;

public class palindromeString {
    public static boolean palindrome(String str){
        int left=0;
        int right = str.length() -1;


        while(left<right){
            if(str.charAt(right) != str.charAt(left)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "ABBAA";
        System.out.println(palindrome(str));
    }
}
