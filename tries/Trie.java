package tries;

class TrieNode{
    char data;
    boolean isTerminating;
    TrieNode children[];

    TrieNode(char data){
        this.data = data;
        isTerminating = false;
        this.children = new TrieNode[26];
    }

}
public class Trie {
    
}
