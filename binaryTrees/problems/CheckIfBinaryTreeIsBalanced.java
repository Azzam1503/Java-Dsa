package binaryTrees.problems;

import binaryTrees.BinaryTreeNode;

public class CheckIfBinaryTreeIsBalanced {
    public static int height(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static boolean isTreeBalanced(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight  = height(root.right);

        if(Math.abs(leftHeight-rightHeight)>1){
            return false;
        }

        boolean isLeftBalanced = isTreeBalanced(root.left);
        boolean isRightBalanced = isTreeBalanced(root.right);

        return isLeftBalanced && isRightBalanced;
    }
}
