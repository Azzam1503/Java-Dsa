package binaryTrees;

import java.util.Scanner;

import queues.usingArrays.QueueEmptyException;
import queues.usingLinkedList.QueueUsingLL;

public class TreeTraversal {
    public static BinaryTreeNode<Integer> takeInput(boolean isRoot, int parentData, boolean isLeft){
        Scanner sc = new Scanner(System.in);
        if(isRoot){
            System.out.println("Enter the root data");
        }else{
            if(isLeft){
                System.out.println("Enter the left node data of: "+ parentData);
            }else{
                System.out.println("Enter the right node data of: "+ parentData);
            }
        }
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
        BinaryTreeNode<Integer> leftNode = takeInput(false, data, true);
        BinaryTreeNode<Integer> rightNode = takeInput(false, data, false);

        root.left = leftNode;
        root.right = rightNode;
        sc.close();
        return root;
        
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

     public static void printPreOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }

        System.out.print(root.data + ": ");
        if(root.left != null){
            System.out.print("L-" + root.left.data + ", ");
        }
        if(root.right != null){
            System.out.print("R-" + root.right.data);
        }
        System.out.println();
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

     public static void printPostOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }

        printPostOrder(root.left);
        printPostOrder(root.right);

        System.out.print(root.data + ": ");
        if(root.left != null){
            System.out.print("L-"+root.left.data);
        }
        if(root.right != null){
            System.out.print("R-"+root.right.data);
        }
        System.out.println();
    }

    public static void printInOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }

        printInOrder(root.left);
        System.out.print(root.data + ": ");
        if(root.left != null){
            System.out.print("L-"+root.left.data);
        }
        if(root.right != null){
            System.out.print("R-"+root.right.data);
        }
        System.out.println();
        printInOrder(root.right);
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
        // BinaryTreeNode<Integer> root = takeInput(true, 0, false);
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        
        System.out.println("------Pre Order---------");
        printPreOrder(root);
        System.out.println("------Post Order---------");
        printPostOrder(root);
        System.out.println("------In Order---------");
        printInOrder(root);
        System.out.println("------Level Wise--------");
        printLevelWise(root);
    }
}
