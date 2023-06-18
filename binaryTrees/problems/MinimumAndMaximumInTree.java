package binaryTrees.problems;

import java.util.Scanner;

import binaryTrees.BinaryTreeNode;
import queues.usingArrays.QueueEmptyException;
import queues.usingLinkedList.QueueUsingLL;

public class MinimumAndMaximumInTree {
    public static PairForMinMax<Integer, Integer> minimumAndMaximum(BinaryTreeNode<Integer> root){
        if(root == null){
            return new PairForMinMax<>(Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

       PairForMinMax<Integer, Integer> leftPair = minimumAndMaximum(root.left);
       PairForMinMax<Integer, Integer> rightPair = minimumAndMaximum(root.right);

        int minimum = Math.min(root.data, Math.min(leftPair.minimum, rightPair.minimum));
        int maximum = Math.max(root.data, Math.max(leftPair.maximum, rightPair.maximum));

        return new PairForMinMax<>(minimum, maximum);
    }

    public static BinaryTreeNode<Integer> takeInput(){
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
            try{
                BinaryTreeNode<Integer> frontNode = pendingNodes.dequeue();
                
                System.out.println("Enter the left child data of: " + frontNode.data);
                int leftChildData = sc.nextInt();
                if(leftChildData != -1){
                    BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
                    frontNode.left = leftChild;
                    pendingNodes.enqueue(leftChild);
                }

                System.out.println("Enter the right child data of: " + frontNode.data);
                int rightChildData = sc.nextInt();
                if(rightChildData != -1){
                    BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
                    frontNode.right = rightChild;
                    pendingNodes.enqueue(rightChild);
                }
            }catch(QueueEmptyException e){
                return null;
            }
        }
        return root;

    }

    public static void print(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            try {
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
            } catch (QueueEmptyException e) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput();
        print(root);
        PairForMinMax<Integer, Integer> minMax = minimumAndMaximum(root);
        System.out.println("Min-" + minMax.minimum + ", " + "Max-"+ minMax.maximum );
    }
}
