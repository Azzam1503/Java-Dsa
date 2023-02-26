package strings.practice;

public class premutation {
    public static boolean checkPermutation(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        int frequency[] = new int[256];
        for(int i=0; i<frequency.length; i++){
            frequency[i] = 0;
        } 


        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            frequency[ch]++;
        }

        for(int i=0; i<s2.length(); i++){
            char ch = s1.charAt(i);
            frequency[ch]--;
        }

        for(int i=0; i<frequency.length; i++){
            if(frequency[i] != 0){
                return false;
            }
        } 

        return true;
    }

    public static void main(String[] args) {
        String s1 = "bcaa";
        String s2 = "cba";
        System.out.println(checkPermutation(s1, s2));
    }
}
