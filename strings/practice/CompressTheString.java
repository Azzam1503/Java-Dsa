package strings.practice;

public class CompressTheString{
    public static String compressTheString(String str){
        String ans ="";
        if(str.length()==0){
            return ans;
        }

        int currentCount = 1;
        ans += str.charAt(0);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==str.charAt(i-1)){
                currentCount++;
            }else{ 
                    if(currentCount > 1){
                    ans += currentCount;
                    currentCount =1;
                }
                ans += str.charAt(i);
            }
        }

        if(currentCount>1){
            ans += currentCount;
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "aaabbc";
        System.out.println(compressTheString(str));
    }
}