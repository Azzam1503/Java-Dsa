package linkedList;
import java.util.*;

public class EliminateDuplicates {
    
    public static Node<Integer> eliminate(Node head){
        Node<Integer> temp = head;
        
        while(temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }

    public static void printLL(Node head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data +  " ");
            temp = temp.next;
        }
        System.out.println();
    }

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

    public static void main(String[] args) {        
        Node<Integer> head = takeInput();
        Node<Integer> head2 = eliminate(head);
        printLL(head2);
    }
}
