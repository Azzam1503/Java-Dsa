package strings.practice;

public class RemoveCharacter {
    public static String removeCharacter(String str, char x){
        String ans = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != x){
                ans = ans + str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "abccada";
        System.out.println(removeCharacter(str, 'a'));
    }
}
