package binarySearchTrees;

import java.util.Scanner;

import queues.usingArrays.QueueEmptyException;
import queues.usingLinkedList.QueueUsingLL;

public class ChecKIfBST {
    
    public static isBST checkIfBST(BinaryTreeNode<Integer> root){
        if(root == null){
            return new isBST(Integer.MIN_VALUE, Integer.MAX_VALUE, true);
        }

        isBST leftOutput = checkIfBST(root.left);
        isBST rightOutput = checkIfBST(root.right);

        int minimun = Math.min(root.data, Math.min(leftOutput.minimun, rightOutput.minimun));
        int maximum = Math.max(root.data, Math.max(leftOutput.maximum, rightOutput.maximum));
        boolean isBST = true;
        if(leftOutput.maximum >= root.data){
            isBST = false;
        }

        if(rightOutput.minimun < root.data){
            isBST = false;
        }

        if(!leftOutput.isBST){
            isBST = false;
        }

        if(!rightOutput.isBST){
            isBST = false;
        }

        return new isBST(maximum, minimun, isBST);


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
        printLevelWise(root);
        System.out.println(checkIfBST(root).isBST);
    }
}
