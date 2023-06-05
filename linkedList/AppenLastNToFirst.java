package linkedList;

import java.util.Scanner;

public class AppenLastNToFirst {

    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null, tail = null;
        while(data != -1){
            Node<Integer> currentNode = new Node<>(data);
            if(head == null){
                head = currentNode;
                tail = currentNode;
            }else{
                tail.next=currentNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }
    public static Node<Integer> appendNToLast(Node head, int n){
        Node<Integer> fast = head;
        Node<Integer> slow = head;
        Node<Integer> initialHead = head;

        for(int i=0; i<n; i++){
            fast=fast.next;
        }

        while(fast.next != null){
            fast=fast.next;
            slow = slow.next;
        }

        Node<Integer> temp = slow.next;
        slow.next = null;
        fast.next = initialHead;
        head = temp;

        return head;
    }

    public static void printLL(Node head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        Node<Integer> appended = appendNToLast(head, 5);
        printLL(appended);

    }
}
