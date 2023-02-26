package strings;

public class stringBufferDemo {
    //StringBuffer mutable while the string is mutable in java

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("abc");
        str.setCharAt(0, 'z');
        str.append("def");
        System.out.println(str + " " + str.length());

    }
}
