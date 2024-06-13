package binarySearchTrees.problems;

import java.util.Scanner;
import java.util.Stack;

import binarySearchTrees.BinaryTreeNode;
import queues.usingArrays.QueueEmptyException;
import queues.usingLinkedList.QueueUsingLL;

public class PairSumInsBST {
    public static int nodesCount(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        int leftCount = nodesCount(root.left);
        int rightCount = nodesCount(root.right);
        return 1 + leftCount + rightCount;

    }

    public static void pairSumInBST(BinaryTreeNode<Integer> root, int s){
        if(root == null){
            return;
        }

        int totalCount = nodesCount(root);
        int count = 0;

        Stack<BinaryTreeNode<Integer>> inOrder = new Stack<>();
        Stack<BinaryTreeNode<Integer>> reverseInOrder = new Stack<>();
        BinaryTreeNode<Integer> temp = root;

        while(temp != null){
            inOrder.push(temp);
            temp = temp.left;
        }

        temp = root;

        while(temp != null){
            reverseInOrder.push(temp);
            temp = temp.right;
        }

        while(count < totalCount-1){
            BinaryTreeNode<Integer> top1 = inOrder.peek();
            BinaryTreeNode<Integer> top2 = reverseInOrder.peek();

            if(top1.data + top2.data == s){
                System.out.println(top1.data + " " + top2.data);

                BinaryTreeNode<Integer> top = top1;
                inOrder.pop();
                count++;
                if(top.right != null){
                    top = top.right;
                    while(top != null){
                        inOrder.push(top);
                        top = top.left;
                    }
                }

                top = top2;
                reverseInOrder.pop();
                count++;
                if(top.left != null){
                    top = top.left;
                    while(top != null){
                        reverseInOrder.push(top);
                        top = top.right;
                    }
                }
            }else if(top1.data + top2.data > s){
                BinaryTreeNode<Integer> top = top2;
                reverseInOrder.pop();
                count++;
                if(top.left != null){
                    top = top.left;
                    while(top != null){
                        reverseInOrder.push(top);
                        top = top.right;
                    }
                }
            }else{
                BinaryTreeNode<Integer> top = top1;
                inOrder.pop();
                count++;
                if(top.right != null){
                    top = top.right;
                    while(top != null){
                        inOrder.push(top);
                        top = top.left;
                    }
                }
            }
        }
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
        // int nodesCount = nodesCount(root);
        // System.out.println(nodesCount);
        pairSumInBST(root, 25);
    }

}
