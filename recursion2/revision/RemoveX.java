package recursion2.revision;

public class RemoveX {
    public static String remove(String str){
        if(str.length() == 0){
            return str;
        }

        String ans = "";

        if(str.charAt(0) != 'x'){
            ans = ans + str.charAt(0);
        }

        String smallAns = remove(str.substring(1));
        return ans + smallAns;
    }

    public static void main(String[] args) {
        String str = "xabxa";
        System.out.println(remove(str));
    }
}
