package tries;

class TrieNode {
    char data;
    boolean isTerminating;
    TrieNode[] children;
    int childCount;

    public TrieNode(char data) {
        this.data = data;
        this.isTerminating = false;
        this.children = new TrieNode[26];
        this.childCount = 0;
    }
};

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode('\0');
    }

    private void add(TrieNode root, String word) {
        if (word.length() == 0) {
            root.isTerminating = true;
            return;
        }

        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }

        add(child, word.substring(1));
    };

    public void add(String word) {
        add(root, word);
    };

    private boolean search(TrieNode root, String word) {
        if (word.length() == 0) {
            if (root.isTerminating)
                return true;
            return false;
        }

        int index = word.charAt(0) - 'a';
        TrieNode child = root.children[index];
        if (child == null) {
            return false;
        }
        ;

        return search(child, word.substring(1));

    };

    public boolean search(String word) {
        return search(root, word);
    }

    private void remove(TrieNode root, String word) {
        if (word.length() == 0) {
            root.isTerminating = false;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null)
            return;

        remove(child, word.substring(1));
        if (!child.isTerminating) {
            if (child.childCount == 0) {
                root.children[childIndex] = null;
                child = null;
                root.childCount--;
            }

        }
    };

    public void remove(String word) {
        remove(root, word);
    }
}