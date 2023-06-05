package linkedList.llWithRecursion;
import java.util.*;

public class MidOfLL {
    
    public static Node<Integer> mid(Node<Integer> head){
        
        Node<Integer> fast = head;
        Node<Integer> slow = head;


        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow .next;
        }
        return slow;
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
        Node<Integer> mid = mid(head);
        printLL(mid);
    }


}
