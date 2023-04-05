package recursion2.Practice;

public class ReplacePi {
    public static String replace(String a){
        String output;

        if(a.length() <= 1){
            return a;
        }

        String small = replace(a.substring(1));
        if(a.charAt(0)=='p' && small.charAt(0)=='i'){
            output = "3.14" + small.substring(1);
        }else{
            output = a.charAt(0) + small;
        }
        return output;
    }

    public static void main(String[] args) {
        String ab = "xpixpi";
        String ac = replace(ab);
        System.out.println(ac);
    }
}
