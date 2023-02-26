package strings;

public class reverseEachWord {
    public static String reverseWords(String str){
        String ans="";
        int currentStartIndex = 0;
        int i=0; 
        for(i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                int currentEndIndex = i-1;;
                String reversedWord = "";
                for(int j=currentStartIndex; j<=currentEndIndex; j++){
                    reversedWord = str.charAt(j) + reversedWord;
                }
                ans = ans + reversedWord+ " ";
                currentStartIndex = i+1;
            }
        }
        int currentEndIndex = i-1;;
                String reversedWord = "";
                for(int j=currentStartIndex; j<=currentEndIndex; j++){
                    reversedWord = str.charAt(j) + reversedWord;
                }
                ans = ans + reversedWord;
        return ans;
    }
    public static void main(String[] args) {
        String str = "abc def ghi";
        System.out.println(reverseWords(str)); 
    }
}
