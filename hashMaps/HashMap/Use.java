package hashMaps.HashMap;

public class Use {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // map.insert("abc", 2);
        // map.insert("bbc", 4);
        // map.insert("dbc", 7);
        // map.insert("abcc", 7);
        // map.insert("abccd", 7);
        // map.insert("abccdd", 7); //******8 */
        // map.insert("abcce", 7);
        // map.insert("abccq", 7);
        // map.insert("abccb", 7);
        // System.out.println(map.size());
        // System.out.println(map.getIndex("abc"));
        // System.out.println(map.getIndex("bbc"));
        // System.out.println(map.search("dbc"));
        // String s = "avavavdsvsv";
        // String a = "ava";
        // System.out.println(s.hashCode());
        // System.out.println(a.hashCode());
        // map.insert(s, 9);
        // -292935445
        // -1424386943
        for (int i = 0; i < 10; i++) {
            map.insert("abc" + i + 1, i + 1);
        }

        System.out.println("----------------------------------------");
        for (int i = 0; i < 10; i++) {
            map.search("abc" + i + 1);
        }
    }
}
