package binarySearchTrees.bstClass;

public class BinaryTreeNode<T> {
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    T data;
    BinaryTreeNode(T data){
        this.data = data;
    }
}
