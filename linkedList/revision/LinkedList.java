package linkedList.revision;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class LinkedList {
    
    public static Node<Integer> ll(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        System.out.println(n1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    public static Node<Integer> inputll(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null, tail = null;
        while(data != -1){
            Node<Integer> currentNode = new Node<>(data);
            if(head == null){
                head = currentNode;
                tail = currentNode;
            }else{
                // Node<Integer> tail = head;
                // while(tail.next != null){
                //     tail = tail.next;
                // }
                // tail.next = currentNode;
                tail.next = currentNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static Node<Integer> insert(Node head, int position, int element){
        Node<Integer> nodeToBeInserted = new Node<>(element);
        int i=0;
        Node<Integer> temp = head;
        while(temp != null && i < position-1){
            temp = temp.next;
            i++;
        }

        if(temp == null){
            return head;
        }

        nodeToBeInserted.next = temp.next;
        temp.next = nodeToBeInserted;

        return head;
    }

    public static Node<Integer> deleteNode(Node head, int position){
        Node<Integer> temp = head;
        int count=0;

        while(temp != null && count < position-1){
            temp = temp.next;
            count++;
        }

        temp.next = temp.next.next;
        return head;
    }

    public static void printLL(Node head){
        Node<Integer> temp = head;
        int count=0;
        while(temp != null){
            // temp.data++;
            // count++;
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        // System.out.println(count);
    }

    public static void main(String[] args) {
        Node<Integer> head = ll();
        Node<Integer> insert = insert(head, 3, 31);
        Node<Integer> delete = deleteNode(head, 3);
        printLL(head);
    }
}
