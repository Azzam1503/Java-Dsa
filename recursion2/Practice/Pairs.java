package recursion2.Practice;

public class Pairs {
    public static String addStar(String str){
        if(str.length()<=1){
            return str;
        }

        String out = addStar(str.substring(1));
        if(str.charAt(0) == str.charAt(1)){
            out = str.charAt(0) + "*" + str.charAt(1) + out.substring(1);
        }else{
            out = str.charAt(0) + out;
        }

        return out;
    }

    public static void main(String[] args) {
        String str = "aabb";
        System.out.println(addStar(str));
    }
}
