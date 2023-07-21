package tries;

class TrieNode {
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    TrieNode(char data) {
        this.data = data;
        this.isTerminating = false;
        this.children = new TrieNode[26];
        this.childCount=0;
    }

}

public class Trie {

    TrieNode root;

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
    }

    public void add(String word) {
        add(root, word);
    }

    private boolean search(String word, TrieNode root) {
        if (word.length() == 0) {
            return root.isTerminating;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            return false;
        } else {
            return search(word.substring(1), child);
        }
    }

    public boolean search(String word) {
        return search(word, root);
    }

    private void remove(String word, TrieNode root){
        if(word.length() == 0){
            root.isTerminating = false;
            return;
        }

        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];

        remove(word.substring(1), child);

        if(!child.isTerminating && child.childCount == 0){
            root.children[childIndex] = null;
            child = null;
            root.childCount--;
        }
        // if(!child.isTerminating){
        //     int numChild = 0;

        //     for(int i=0; i<26; i++){
        //         if(child.children[i] != null){
        //             numChild++;
        //         }
        //     }
        //     if(numChild == 0){
        //         root.children[childIndex] = null;
        //         child = null;
        //     }
        // }

    }

    public void remove(String word){
        remove(word, root);
    }
}
