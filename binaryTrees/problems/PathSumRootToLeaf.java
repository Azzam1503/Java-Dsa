package binaryTrees.problems;

import binaryTrees.BinaryTreeNode;

public class PathSumRootToLeaf {
    public static void pathSumToRootLeaf(BinaryTreeNode<Integer> root, int k, String path, int currSum){
        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            currSum += root.data;
            if(currSum == k){
                System.out.println(path + root.data + " ");
            }

            return;
        }

        pathSumToRootLeaf(root.left, k, path + root.data + " ", currSum+root.data);
        pathSumToRootLeaf(root.right, k, path + root.data + " ", currSum+root.data);

    }
}
