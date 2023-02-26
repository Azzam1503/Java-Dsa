package strings.practice;

public class reverseEachword {
    public static String reverseWords(String str){
        String ans = "";
        int n = str.length();
        int currentStartIndex = 0;
        int i=0;
        for(; i<n; i++){
            if(str.charAt(i) == ' '){
                int currentEndIndex = i-1;
                String reversedWord = "";
                for(int j=currentStartIndex; j<=currentEndIndex; j++){
                    reversedWord = str.charAt(j) + reversedWord;
                }
                ans = ans + reversedWord + " ";
                currentStartIndex = i+1;
            }
        }

        int currentEndIndex = i-1;
        String reverseWord ="";
        for(int j=currentStartIndex; j<=currentEndIndex; j++){
            reverseWord = str.charAt(j) + reverseWord;
        }
        ans += reverseWord +" ";
        return ans;
    }

    public static void main(String[] args) {
        String str = "Hey I am here";
        System.out.println(reverseWords(str));
    }
}
