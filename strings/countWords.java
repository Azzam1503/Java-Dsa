package strings;

public class countWords {
    public static int count(String str){
        int space = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                space++;
            }
        }
        return space + 1;
    }

    public static void main(String[] args) {
        String str = "I am here for you";
        System.out.println(count(str));
    }
}
