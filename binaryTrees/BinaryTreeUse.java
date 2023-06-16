package binaryTrees;

public class BinaryTreeUse {

    public static void printBinaryTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }

        System.out.print(root.data+ ": ");
        if(root.left != null){
            System.out.print("L-" + root.left.data + ", ");
        }

        if(root.right != null){
            System.out.print("R-" + root.right.data);
        }
        System.out.println();
        printBinaryTree(root.left);
        printBinaryTree(root.right);
    }
    
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> right = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> left = new BinaryTreeNode<>(5);

        root.left = rootLeft;
        root.right = rootRight;
        rootLeft.right = right;
        rootRight.left = left;
        printBinaryTree(root);
    }
}
