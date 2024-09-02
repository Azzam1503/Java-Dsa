import java.util.HashMap;

public class prac {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String s = "abccdd";
        System.out.println(s.hashCode());
        map.put(s, 7);
        System.out.println(map.get("abccdd"));
    }
}