package strings.practice;

public class HighestOcuuringCharacter {
    public static char highestOcuuringCharacter(String str){
        char ans=' ';
        int frequency[] = new int[256];
        int maxFrequency =0;
        for(int i=0; i<str.length(); i++){
            frequency[str.charAt(i)]++;
            maxFrequency = Math.max(maxFrequency, frequency[str.charAt(i)]);
        }

    for(int i=0; i<str.length(); i++){
        if(frequency[str.charAt(i)] == maxFrequency){
            ans = str.charAt(i);
            break;
        }
    }
        return ans;
    }

    public static void main(String[] args) {
        String str = "aabbaacd";
        System.out.println(highestOcuuringCharacter(str));
    }
}
