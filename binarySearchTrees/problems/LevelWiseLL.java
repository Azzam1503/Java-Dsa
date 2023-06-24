package binarySearchTrees.problems;

import java.util.ArrayList;
import java.util.Scanner;

import binarySearchTrees.BinaryTreeNode;
import linkedList.Node;
import queues.usingArrays.QueueEmptyException;
import queues.usingLinkedList.QueueUsingLL;
import stack.questions.StockSpan;

public class LevelWiseLL {
    public static ArrayList<Node<Integer>> levelWiseLL(BinaryTreeNode<Integer> root){
        if(root == null){
            return null;
        }

        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        pendingNodes.enqueue(root);
        
        int currentLevelRemaining =1;
        int nextLevelCount = 0;

        ArrayList<Node<Integer>> output = new ArrayList<>();
        Node<Integer> head = null;
        Node<Integer> tail = null;


        while(!pendingNodes.isEmpty()){
            try {
                BinaryTreeNode<Integer> currentTreeNode = pendingNodes.dequeue();
                Node<Integer> newNode = new Node<Integer>(currentTreeNode.data);
                if(head == null){
                    head = newNode;
                    tail = newNode;
                }else{
                    tail.next = newNode;
                    tail = newNode;
                }

                if(currentTreeNode.left !=  null){
                    pendingNodes.enqueue(currentTreeNode.left);
                    nextLevelCount++;
                }

                if(currentTreeNode.right !=  null){
                    pendingNodes.enqueue(currentTreeNode.right);
                    nextLevelCount++;
                }

                currentLevelRemaining--;

                if(currentLevelRemaining == 0){
                    output.add(head);
                    head = null;
                    tail = null;
                    currentLevelRemaining = nextLevelCount;
                    nextLevelCount=0;
                }
            } catch (QueueEmptyException e) {
                return null;
            }
        }
        return output;

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
        ArrayList<Node<Integer>> output = levelWiseLL(root);
        for(Node<Integer> i:output){
            Node<Integer> temp = i;
            while(temp !=  null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }



}
