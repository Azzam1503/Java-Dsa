package binaryTrees.problems;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.FutureTask;

import binaryTrees.BinaryTreeNode;
import queues.usingArrays.QueueEmptyException;
import queues.usingLinkedList.QueueUsingLL;

public class DiameterOfTree {
    public static int height(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static int diameter(BinaryTreeNode<Integer> root){
        //Time complexcity O(n*h)
        if(root == null){
            return -1;
        }

        int option1 = height(root.left) + height(root.right);
        int option2 = diameter(root.left);
        int option3 = diameter(root.right);

        return Math.max(option1, Math.max(option2, option3));
    }

    public static BinaryTreeNode<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNoodes = new QueueUsingLL<>();
        System.out.println("Enter the root data");
        int data = sc.nextInt();

        if(data == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
        pendingNoodes.enqueue(root);

        while(!pendingNoodes.isEmpty()){
            try {
                BinaryTreeNode<Integer> frontNode = pendingNoodes.dequeue();

                System.out.println("Enter the data of left node for: " + frontNode.data);
                int leftChildData = sc.nextInt();
                if(leftChildData != -1){
                    BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
                    frontNode.left = leftChild;
                    pendingNoodes.enqueue(leftChild);
                }

                System.out.println("Enter the data of right node for: " + frontNode.data);
                int rightChildData = sc.nextInt();
                if(rightChildData != -1){
                    BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
                    frontNode.left = rightChild;
                    pendingNoodes.enqueue(rightChild);
                }
            } catch (QueueEmptyException e) {
                return null;
            }
        }
        return root;

    }

    public static void print(BinaryTreeNode<Integer> root) throws QueueEmptyException{
        if(root == null){
            return;
        }
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            try{
                BinaryTreeNode<Integer> frontNode = pendingNodes.dequeue();

                System.out.print(frontNode.data + ": ");
                if(frontNode.left != null){
                    System.out.print("L-"+frontNode.left.data + ", ");
                    pendingNodes.enqueue(frontNode.left);
                }

                if(frontNode.right != null){
                    System.out.print("R-"+frontNode.right.data);
                    pendingNodes.enqueue(frontNode.right);
                }
                System.out.println();
            }catch(QueueEmptyException e){
                return;
            }

            
        }
        
        
    }

    public static void main(String[] args) {
        
    }
}
