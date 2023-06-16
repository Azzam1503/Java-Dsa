package binaryTrees;

import java.util.Scanner;

public class NodeSum {
    public static BinaryTreeNode<Integer> takeInput(boolean isRoot, int parentData, boolean isLeft){
        Scanner sc = new Scanner(System.in);
        if(isRoot){
            System.out.println("Enter the root data");
        }else{
            if(isLeft){
                System.out.println("Enter the left node data of: "+ parentData);
            }else{
                System.out.println("Enter the right node data of: "+ parentData);
            }
        }
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
        BinaryTreeNode<Integer> leftNode = takeInput(false, data, true);
        BinaryTreeNode<Integer> rightNode = takeInput(false, data, false);

        root.left = leftNode;
        root.right = rightNode;

        return root;
        
    }

    public static void printTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }

        System.out.print(root.data + ": ");
        if(root.left != null){
            System.out.print("L-" + root.left.data + ", ");
        }
        if(root.right != null){
            System.out.print("R-" + root.right.data);
        }
        System.out.println();
        printTree(root.left);
        printTree(root.right);
    }


    public static int nodeSum(BinaryTreeNode<Integer> root){
        if(root == null) return 0;

        int leftSum = nodeSum(root.left);
        int rightSum = nodeSum(root.right);

        return root.data + leftSum + rightSum;
    }

   

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput(true, 0, false);
        System.out.println("------Pre Order---------");
        printTree(root);
        

        System.out.println(nodeSum(root));
    }
    
}
