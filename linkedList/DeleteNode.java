package linkedList;

import java.util.Scanner;

public class DeleteNode {
    public static Node<Integer> deleteNode(Node<Integer> head, int position){
        
        Node<Integer> currentHead = head;
        int count = 0;
        while(count<(position-1) && currentHead != null){
            currentHead = currentHead.next;
            count++;
        }
        if(currentHead.next == null || currentHead == null){
            return head;
        }
        currentHead.next = currentHead.next.next;

        return head;
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

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        deleteNode(head, 2);
        print(head);
    }
}
