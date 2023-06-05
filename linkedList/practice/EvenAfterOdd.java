package linkedList.practice;

import java.util.Scanner;



public class EvenAfterOdd {
    public static Node<Integer> evenAfterOdd(Node<Integer> head){
        Node<Integer> evenHead = null, evenTail = null, oddHead = null, oddTail = null;

        while(head != null){
            if(head.data % 2 == 0){
                if(evenHead == null){
                    evenHead = head;
                    evenTail = head;
                }else{
                    evenTail.next = head;
                    evenTail = evenTail.next;
                }
            }else{
                if(oddHead == null){
                    oddHead = head;
                    oddTail = head;
                }else{
                    oddTail.next = head;
                    oddTail = oddTail.next;
                }
            }
            head = head.next;
        }

        if(oddHead == null){
            return evenHead;
        }else{
            oddTail.next = evenHead;
        }

        if(evenHead != null){
            evenTail.next = null;
        }
        return oddHead;
    }

    public static Node<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null, tail = null;
        while(data != -1){
            Node<Integer> currnetNode = new Node<>(data);
            if(head == null){
                head = currnetNode;
                tail = currnetNode;
            }else{
                tail.next = currnetNode;
                tail = tail.next;
            }
            data = s.nextInt();
        }
        s.close();
        return head;
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
        Node<Integer> head= takeInput();
        head = evenAfterOdd(head);
        printLL(head);
    }
}
