package Trees;
import queues.usingArrays.QueueEmptyException;
import queues.usingLinkedList.QueueUsingLL;

import java.util.Scanner;

public class TreeUse {

    public static int treeHeight(Tree<Integer> root){
        if(root == null){
            return 0;
        }

        int height =0;
        for(int i=0; i<root.children.size(); i++){
            int childHeight = treeHeight(root.children.get(i));
            height++;
        }
        return height + 1;
    }

    public static int largestNode(Tree<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        int ans = root.data;
        for(int i=0; i<root.children.size(); i++){
            int childAns = largestNode(root.children.get(i));
            if(childAns > ans){
                ans = childAns;
            }
        }
        return ans;
    } 

    public static int numNodes(Tree<Integer> root){
        if(root == null){
            return 0;
        }
        int count =1;

        for(int i=0; i<root.children.size(); i++){
            count += numNodes(root.children.get(i));
        }
        return count;
    }

    //input function
    public  static Tree<Integer> takeInput(Scanner s){
        System.out.println("Enter the next root data");
        int n = s.nextInt();
        Tree<Integer> root = new Tree<Integer>(n);
        System.out.println("Enter the child for " + n);
        int childCount = s.nextInt();
        for(int i=0; i<childCount; i++){
            Tree<Integer> child = takeInput(s);
            root.children.add(child);
        }
        return root;
    }

    public static Tree<Integer> takeInputLevelWise(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root data");
        int data = s.nextInt();
        Tree<Integer> root = new Tree<Integer>(data);
        QueueUsingLL<Tree<Integer>> pendingNodes = new QueueUsingLL<>();
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            try {
                Tree<Integer> frontNode = pendingNodes.dequeue();
                System.out.println("Enter the number of children for: " +frontNode.data);
                int childNumber = s.nextInt();
                for(int i=0; i<childNumber; i++){
                    System.out.println("Enter the "+ (i+1)+"th node of "+frontNode.data);
                    int child = s.nextInt();
                    Tree<Integer> childNode = new Tree<Integer>(child);
                    frontNode.children.add(childNode);
                    pendingNodes.enqueue(childNode);
                }
            } catch (QueueEmptyException e) {
                // becuase it will not reach here
                return null;
            }
        }
        return root;
        
    }

    public static void printTree(Tree<Integer> root){
        String s = root.data + ":";
        for(int i=0; i<root.children.size(); i++){
            s = s + root.children.get(i).data+", ";
        }
        System.out.println(s);
        for(int i=0; i<root.children.size(); i++){
            printTree(root.children.get(i));
        }
    }

    public static void printTreeLevelWise(Tree<Integer> root){ 
        QueueUsingLL<Tree<Integer>> pendingNodes = new QueueUsingLL<>();
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            try {
                Tree<Integer> forntNode = pendingNodes.dequeue();
                String s= forntNode.data + ": ";
                for(int i=0; i<forntNode.children.size(); i++){
                    s = s + forntNode.children.get(i).data +", ";
                    pendingNodes.enqueue(forntNode.children.get(i));
                }
                System.out.println(s);
            } catch (QueueEmptyException e) {
                return;
            }
        }
    }
    public static void main(String[] args) {
        // Tree<Integer> root = new Tree<Integer>(4);
        // Tree<Integer> node1 = new Tree<Integer>(2);
        // Tree<Integer> node2 = new Tree<Integer>(3);
        // Tree<Integer> node3 = new Tree<Integer>(5);
        // Tree<Integer> node4 = new Tree<Integer>(6);

        // root.children.add(node1);
        // root.children.add(node2);
        // root.children.add(node3);
        // node2.children.add(node4);

        // System.out.println(root.children);
        Scanner s = new Scanner(System.in);

        // Tree<Integer> root = takeInput(s);
        Tree<Integer> root = takeInputLevelWise();

        printTreeLevelWise(root);

        System.out.println(numNodes(root));
        System.out.println(largestNode(root));

 
    }
}
