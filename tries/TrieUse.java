package tries;

public class TrieUse {

    public static void main(String[] args) {
        Trie t = new Trie();
        t.add("news");
        t.add("newss");
        t.add("view");
        t.add("clap");

        System.out.println(t.search("news"));
        t.remove("news");
    }

}
