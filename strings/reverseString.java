package strings;

public class reverseString {
    public static String reverse(String str){
        String reversedString = "";
        // for(int i = str.length()-1; i>=0; i--){
        //     reversedString = reversedString + str.charAt(i);
        // }

        //another approach
        for(int i=0; i<str.length(); i++){
            reversedString = str.charAt(i) + reversedString;
        }


        return reversedString;
    }

    public static void main(String[] args) {
        String str = "mam";
        String reversed = reverse(str);
        System.out.println(str);
        System.out.println(reversed);

        // if(str.equals(reversed)){
        //     System.out.println("String is palindrome");
        // }

    }
}
