package recursion2;

public class ReplaceChar {
    public static String replace(String str, char a, char b){
        if(str.length()==0){
            return str;
        }
        char c;
        if(str.charAt(0) == a){
             c = b;
        }else{
            c = str.charAt(0);
        }

        String smallAns = replace(str.substring(1), a, b);
        return (c + smallAns);
    }

    public static void main(String[] args) {
        String str = "abcdc";
        System.out.println(replace(str, 'c', 'e'));
    }
}
