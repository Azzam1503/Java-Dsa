package recursion3.revision;

public class ReturnSubsequences {
    public static String[] subsequences(String str){
        if(str.length() == 0){
            String[] ans = {""};
            return ans;
        }

        String[] smallAns = subsequences(str.substring(1));
        String[] ans = new String[smallAns.length*2];

        
        for(int i=0; i<smallAns.length; i++){
            ans[i] = smallAns[i];
        }

        for(int i=0; i<smallAns.length; i++){
            ans[i+smallAns.length] = str.charAt(0) + smallAns[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] str = subsequences("xyz");

        for(int i=0; i<str.length; i++){
            System.out.println(str[i]);
        }

    }
}
