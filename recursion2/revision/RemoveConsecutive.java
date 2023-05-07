package recursion2.revision;

public class RemoveConsecutive {
    public static String remvoe(String str){
        if(str.length() == 1){
            return str;
        }

        String ans = "";
        String smallAns;

        if(str.charAt(0) == str.charAt(1)){
            return remvoe(str.substring(1));
        }else{
            ans += str.charAt(0);
            smallAns = remvoe(str.substring(1));
            return ans + smallAns;
        }

    }

    public static void main(String[] args) {
        String str = "aabbbbaccd";
        System.out.println(remvoe(str));
        System.out.println(str.substring(2));
    }
}
