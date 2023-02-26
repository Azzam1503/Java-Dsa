package strings.practice;

public class removeConsecutive {
    public static String removeConsec(String str){
        String ans = "";
        int n = str.length();
        for(int i=0; i<n-1;i++){
            if(str.charAt(i) != str.charAt(i+1)){
                ans = ans+str.charAt(i);
            }
        }
        if(str.charAt(n-1) != str.charAt(n-2)){
            ans += str.charAt(n-1);
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = "xxyyyzzaa";
        System.out.println(removeConsec(str));
    }
}
