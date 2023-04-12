package recursion3;

public class Subsequences {
    public static String[] findSubsequesnces(String str){
        if(str.length() == 0){
            String[] ans = {" "};
            return ans;
        }

        String smallAns[] = findSubsequesnces(str.substring(1));
        String ans[] = new String[2 * smallAns.length];

        for(int i=0; i<smallAns.length; i++){
            ans[i] = smallAns[i];
        }

        for(int i=0; i<smallAns.length; i++){
            ans[i+smallAns.length] = str.charAt(0) + smallAns[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "XYZ";
        String[] ans = findSubsequesnces(str);
        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
