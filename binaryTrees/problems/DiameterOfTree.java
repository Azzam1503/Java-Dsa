package binaryTrees.problems;
import java.util.Scanner;

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

    public static Pair<Integer, Integer> betterDiameter(BinaryTreeNode<Integer> root){
        //Time complexity O(n)
        if(root == null){
            Pair<Integer, Integer> output = new Pair<>();
            output.height = 0;
            output.diameter = 0;
            return output;
        }

        Pair<Integer, Integer> leftOutput = betterDiameter(root.left);
        Pair<Integer, Integer> rightOutput = betterDiameter(root.right);

        int height = 1 + Math.max(leftOutput.height, rightOutput.height);
        int option1 = leftOutput.height + rightOutput.height;
        int option2 = leftOutput.diameter;
        int option3 = rightOutput.diameter;

        int diameter = Math.max(option1, Math.max(option2, option3));
        Pair<Integer, Integer> output = new Pair<Integer, Integer>();
        output.height= height;
        output.diameter = diameter;
        return output;

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
                    frontNode.right = rightChild;
                    pendingNoodes.enqueue(rightChild);
                }
            } catch (QueueEmptyException e) {
                return null;
            }
        }
        return root;

    }

    public static void print(BinaryTreeNode<Integer> root) {
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
        BinaryTreeNode<Integer> root = takeInput();
        print(root);

        System.out.println("Diameter- "+ betterDiameter(root).diameter);
        System.out.println("height- "+ betterDiameter(root).height);
    }
}
