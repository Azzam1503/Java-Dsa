package linkedList.practice;
import java.util.*;

public class SwapTwoNodes {
    public static Node<Integer> swapTwoNode(Node<Integer> head){
        Node<Integer> curNode = head, prev = null;

        while(curNode.next != null){
            prev = curNode.next;
            prev.next = curNode;

            curNode.next = curNode.next.next;
        }
        return head;
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
        head = swapTwoNode(head);
        printLL(head);
    }
}
