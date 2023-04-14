package recursion3;

import java.util.HashSet;

public class Subsequences {
    // public static String[] findSubsequesnces(String str){
    //     if(str.length() == 0){
    //         String[] ans = {" "};
    //         return ans;
    //     }

    //     String smallAns[] = findSubsequesnces(str.substring(1));
    //     String ans[] = new String[2 * smallAns.length];

    //     for(int i=0; i<smallAns.length; i++){
    //         ans[i] = smallAns[i];
    //     }

    //     for(int i=0; i<smallAns.length; i++){
    //         ans[i+smallAns.length] = str.charAt(0) + smallAns[i];
    //     }
    //     return ans;
    // }

    public static void approach2(String str, int index, String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        char current = str.charAt(index);
        approach2(str, index+1, newString + current);

        approach2(str, index+1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        approach2(str, 0, "");
        // String[] ans = findSubsequesnces(str);
        // for(int i=0; i<ans.length; i++){
        //     System.out.println(ans[i]);
        // }
    }
}
