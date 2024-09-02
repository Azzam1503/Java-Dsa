package hashMaps;

public class MapUse {
    public static void main(String[] args) {
        Map<String, Integer> map = new Map<>();

        // for (int i = 0; i < 20; i++) {
        // map.insert("abc" + i, i + 1);
        // }

        // map.removeKey("abc2");
        // map.removeKey("abc5");
        // for (int i = 0; i < 20; i++) {
        // System.out.println(("abc" + i) + ": " + map.getValue("abc" + i));
        // }
        // map.insert("abccdd", 7);
        // for (int i = 0; i < 11; i++) {
        // String s = "abc" + i + 1;
        // System.out.println(s);
        // map.insert("abc" + i + 1, i + 1);
        // }

        // System.out.println("----------------------------------------");
        // for (int i = 0; i < 11; i++) {
        // System.out.println(map.getValue("abc" + i + 1));
        // }
        String s = "abc101";
        System.out.println(s.hashCode());
        map.insert(s, 3);
    }
}
