package binarySearchTrees.problems;

import java.util.ArrayList;
import java.util.Scanner;

import binarySearchTrees.BinaryTreeNode;
import queues.usingArrays.QueueEmptyException;
import queues.usingLinkedList.QueueUsingLL;

public class RootToNodePathBST {
    
    public static ArrayList<Integer> rootToNode(BinaryTreeNode<Integer> root, int x){
        if(root == null){
            return null;
        }

        if(root.data == x){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }else if(x < root.data){
            ArrayList<Integer> leftoutput = rootToNode(root.left, x);
            if(leftoutput != null){
                leftoutput.add(root.data);
            }
            return leftoutput;
        }else{
           ArrayList<Integer> rightoutput = rootToNode(root.right, x);
            if(rightoutput != null){
                rightoutput.add(root.data);
            } 
            return rightoutput;
        }
    }

    public static BinaryTreeNode<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root data");
        int data = sc.nextInt();

        if(data == -1){
            return null;
        }
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            try{
                BinaryTreeNode<Integer> forntNode = pendingNodes.dequeue();
                System.out.println("Enter the left child data of: " + forntNode.data);
                int leftChildData = sc.nextInt();
                if(leftChildData != -1){
                    BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
                    pendingNodes.enqueue(leftChild);
                    forntNode.left = leftChild;
                }
                System.out.println("Enter the right child data of: " + forntNode.data);
                int rightChildData = sc.nextInt();
                if(rightChildData != -1){
                    BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
                    pendingNodes.enqueue(rightChild);
                    forntNode.right = rightChild;
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
            try{
                BinaryTreeNode<Integer> forntNode = pendingNodes.dequeue();
                System.out.print(forntNode.data + ": ");
                if(forntNode.left != null){
                    System.out.print("L-" + forntNode.left.data + ", ");
                    pendingNodes.enqueue(forntNode.left);
                }
                if(forntNode.right != null){
                    System.out.print("R-" + forntNode.right.data);
                    pendingNodes.enqueue(forntNode.right);
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
        ArrayList<Integer> ans = rootToNode(root, 3);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
