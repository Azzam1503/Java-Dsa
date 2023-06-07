package linkedList.llWithRecursion;
import java.util.*;

public class ReverseLL {
    
    public static Node<Integer> reverse(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> smallHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return smallHead;
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

        System.out.print(head.data + " ");
        printLL(head.next);
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        Node<Integer> head2 =reverse(head);
        printLL(head2);
    }
}
