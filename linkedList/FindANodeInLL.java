package linkedList;
import java.util.*;

public class FindANodeInLL {

    public static int nodeInLL(Node head, int element){
        int count =0;

        Node<Integer> temp = head;

        while(temp != null){
            if(temp.data == element){
                return count;
            }
            temp = temp.next;
            count++;
        }

        return -1;
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
        printLL(head);
        int node = nodeInLL(head, 70);

        System.out.println(node);
    }
}
