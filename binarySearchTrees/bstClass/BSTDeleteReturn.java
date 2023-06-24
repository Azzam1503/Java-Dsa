package binarySearchTrees.bstClass;

public class BSTDeleteReturn {
    BinaryTreeNode<Integer> root;
    boolean deleted;

    BSTDeleteReturn(BinaryTreeNode<Integer> root, boolean deleted){
        this.root = root;
        this.deleted = deleted;
    }
}
