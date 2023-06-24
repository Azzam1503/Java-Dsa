package binarySearchTrees.bstClass;

public class BSTUse {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        tree.insert(3);
        tree.insert(6);
        tree.insert(8);

        tree.printTree();
        System.out.println(tree.size());
    }
}
