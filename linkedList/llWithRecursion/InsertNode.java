package linkedList.llWithRecursion;

import java.util.Scanner;

public class InsertNode {
    
    public static Node<Integer> insert(Node<Integer> head, int pos, int ele){
        if(head == null && pos>0){
            return head;
        }
        if(pos == 0){
            Node<Integer> temp = head;
            head = new Node<Integer>(ele);
            head.next = temp;
            return head;
        }else{
            head.next = insert(head.next, pos-1, ele);
            return head; 
        }

        
    }

    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = null, tail = null;
        int data = sc.nextInt();
        while(data != -1){
            Node<Integer> currentNode = new Node<>(data); 
            if(head == null){
                head = currentNode;
                tail = currentNode;
            }else{
                tail.next = currentNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void printLL(Node<Integer> head){
        if(head == null){
            return;
        }

        System.out.println(head.data);
        printLL(head.next);
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        Node<Integer> inserted = insert(head, 2, 31);
        printLL(head);
    }
}
