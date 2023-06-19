package binaryTrees.problems;

import java.util.Scanner;

import binaryTrees.BinaryTreeNode;
import queues.usingArrays.QueueEmptyException;
import queues.usingLinkedList.QueueUsingLL;

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

    public static BalanceTreeReturn isTreeBalancedBetter(BinaryTreeNode<Integer> root){
        if(root == null){
            BalanceTreeReturn ans = new BalanceTreeReturn();
            ans.height = 0;
            ans.isBalanced = true;
            return ans;
        }

        BalanceTreeReturn leftOutput = isTreeBalancedBetter(root.left);
        BalanceTreeReturn rightOutput = isTreeBalancedBetter(root.right);

        int height = 1 + Math.max(leftOutput.height, rightOutput.height);
        boolean isBal = true;
        if(Math.abs(leftOutput.height - rightOutput.height) > 1){
            isBal = false;
        }

        if(!leftOutput.isBalanced || !rightOutput.isBalanced){
            isBal = false;
        }

        BalanceTreeReturn ans = new BalanceTreeReturn();
        ans.height = height;
        ans.isBalanced = isBal;
        return ans;


    }

        public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        System.out.println("Enter the root data");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            try {
                BinaryTreeNode<Integer> frontNode = pendingNodes.dequeue();
                System.out.println("Enter left node data of " + frontNode.data);
                int leftChildData = sc.nextInt();
                if(leftChildData != -1){
                    BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
                    pendingNodes.enqueue(leftChild);
                    frontNode.left = leftChild;
                }

                System.out.println("Enter right node data of " + frontNode.data);
                int rightChildData = sc.nextInt();
                if(rightChildData != -1){
                    BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
                    pendingNodes.enqueue(rightChild);
                    frontNode.right = rightChild;
                }
            } catch (QueueEmptyException e) {
                return null;
            }
        }
        return root;
    }

        public static void printLevelWise(BinaryTreeNode<Integer> root){
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            try{
                BinaryTreeNode<Integer> frontNode = pendingNodes.dequeue();
                System.out.print(frontNode.data + ": ");
                if(frontNode.left != null){
                    System.out.print("L-" + frontNode.left.data + ", ");
                    pendingNodes.enqueue(frontNode.left);
                }
                if(frontNode.right != null){
                    System.out.print("R-" + frontNode.right.data);
                    pendingNodes.enqueue(frontNode.right);
                }
                System.out.println();
            }catch(QueueEmptyException e){
                return;
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println(isTreeBalancedBetter(root).isBalanced);
        System.out.println(isTreeBalancedBetter(root).height);
    }

}

