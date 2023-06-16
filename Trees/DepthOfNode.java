package Trees;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicComboBoxUI.FocusHandler;

import queues.usingArrays.QueueEmptyException;
import queues.usingLinkedList.QueueUsingLL;

public class DepthOfNode{
    
    public static void printToK(Tree<Integer> root, int k){
        if(k<0){
            return;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }

        for(int i=0; i<root.children.size(); i++){
            printToK(root.children.get(i), k-1);
        }
    }

    public static Tree<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data of root node");
        int data = sc.nextInt();
        Tree<Integer> root = new Tree<Integer>(data);
        QueueUsingLL<Tree<Integer>> pendingNodes = new QueueUsingLL<>();
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            try {
                Tree<Integer> frontNode = pendingNodes.dequeue();
                System.out.println("Enter the number of child for " + frontNode.data);
                int childNum = sc.nextInt();
                for(int i=0; i<childNum; i++){
                    System.out.println("Enter the data of " + (i+1)+ "th child for " + frontNode.data);
                    int childData = sc.nextInt();
                    Tree<Integer> childNode = new Tree<Integer>(childData);
                    frontNode.children.add(childNode);
                    pendingNodes.enqueue(childNode);
                }
            } catch (QueueEmptyException e) {
                return null;
            }
        }
        return root;
    }

    public static void printLevelWise(Tree<Integer> root){
        if(root == null){
            return;
        }

        QueueUsingLL<Tree<Integer>> pendingNode = new QueueUsingLL<>();
        pendingNode.enqueue(root);
        while(!pendingNode.isEmpty()){
            try {
                Tree<Integer> frontNode = pendingNode.dequeue();
                String s = frontNode.data + ": ";

                for(int i=0; i<frontNode.children.size(); i++){
                    s = s + frontNode.children.get(i).data + ", ";
                    pendingNode.enqueue(frontNode.children.get(i));
                }
                System.out.println(s);
            } catch (QueueEmptyException e) {
                return;
            }
            
        }
    }

    

    public static void main(String[] args) {
        Tree<Integer> root = takeInputLevelWise();
        printLevelWise(root);
        printToK(root, 2);
    }
}