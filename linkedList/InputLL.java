package linkedList;

import java.util.Scanner;

public class InputLL {
    public static Node<Integer> input(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null, tail = null;

        while(data != -1){
            Node<Integer> currnetNode = new Node<>(data);
            if(head == null){
                head = currnetNode;
                tail = currnetNode;
            }else{
                // Node<Integer> tail = head;
                // while(tail.next != null){
                //     tail = tail.next;
                // }

                tail.next = currnetNode;
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
        Node<Integer> head = input();
        print(head);
    }
}
