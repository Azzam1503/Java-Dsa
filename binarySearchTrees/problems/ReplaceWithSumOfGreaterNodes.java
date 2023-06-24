package binarySearchTrees.problems;

import java.util.Scanner;

import binarySearchTrees.BinaryTreeNode;
import queues.usingArrays.QueueEmptyException;
import queues.usingLinkedList.QueueUsingLL;

public class ReplaceWithSumOfGreaterNodes {
    
    public static int replace(BinaryTreeNode<Integer> root, int sum){
        if(root == null){
            return sum;
        }

        sum = replace(root.right, sum);
        sum += root.data;
        root.data = sum;
        sum = replace(root.left, sum);
        return sum;

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
        System.out.println(replace(root, 0));
        printLevelWise(root);
    }
}
 