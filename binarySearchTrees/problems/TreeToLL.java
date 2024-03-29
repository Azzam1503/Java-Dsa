package binarySearchTrees.problems;

import java.util.Scanner;

import binarySearchTrees.BinaryTreeNode;
import linkedList.Node;
import queues.usingArrays.QueueEmptyException;
import queues.usingLinkedList.QueueUsingLL;

public class TreeToLL {
    public static PairOfNodes treeToLL(BinaryTreeNode<Integer> root){
        if(root == null){
            PairOfNodes pair = new PairOfNodes();
            return pair;
        }

        Node<Integer> currentNode = new Node<Integer>(root.data);
        PairOfNodes leftList = treeToLL(root.left);
        PairOfNodes rightList = treeToLL(root.right);
        PairOfNodes pair = new PairOfNodes();

        if(leftList.tail != null){
            leftList.tail.next = currentNode;
        }

        currentNode.next = rightList.head;

        if(leftList.head != null){
            pair.head = leftList.head;
        }else{
            pair.head = currentNode;
        }

        if(rightList.tail != null){
            pair.tail = rightList.tail;
        }else{
            pair.tail = currentNode;
        }

        return pair;
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

    public static void printLL(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        printLevelWise(root);

        Node<Integer> head = treeToLL(root).head;
        printLL(head);
    }

}
