package recursion2;

public class RemoveDuplicate {
    public static String remove(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0) == str.charAt(1)){
            return remove(str.substring(1));
        }else{
            String smallAns = remove(str.substring(1));
            return str.charAt(0) + smallAns;
        }

    }

    public static void main(String[] args) {
        String str = "aabbcc";
        System.out.println(remove(str));
    }
}
