package binaryTrees;

import java.util.Scanner;

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

    public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot, int parentData, boolean isLeft){
        if(isRoot){
            System.out.println("Enter the root data:");
        }else{
            if(isLeft){
                System.out.println("Enter the left node data of: " + parentData);
            }else{
                System.out.println("Enter the right node data of: "+parentData);
            }
        }
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
        BinaryTreeNode<Integer> rootLeft = takeInputBetter(false, data, true);
        BinaryTreeNode<Integer> rootRight = takeInputBetter(false, data, false);

        root.left = rootLeft;
        root.right = rootRight;
        return root;
    }

    public static BinaryTreeNode<Integer> takeInput(){
        System.out.println("Enter the root data");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
        BinaryTreeNode<Integer> rootLeft = takeInput();
        BinaryTreeNode<Integer> rootRight = takeInput();

        root.left = rootLeft;
        root.right = rootRight;
        return root;
    }
    
    public static void main(String[] args) {
        // BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        // BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
        // BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
        // BinaryTreeNode<Integer> right = new BinaryTreeNode<>(4);
        // BinaryTreeNode<Integer> left = new BinaryTreeNode<>(5);

        // root.left = rootLeft;
        // root.right = rootRight;
        // rootLeft.right = right;
        // rootRight.left = left;

        BinaryTreeNode<Integer> root = takeInputBetter(true, 0, false);
        printBinaryTree(root);
    }
}
