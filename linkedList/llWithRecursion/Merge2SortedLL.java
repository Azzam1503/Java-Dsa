package linkedList.llWithRecursion;
import java.util.*;

public class Merge2SortedLL {
    public static Node<Integer> mergeTwoSortedLL(Node<Integer> list1, Node<Integer> list2){
        Node<Integer> t1 = list1, t2 = list2;
        Node<Integer> head = null, tail = null;
        while(t1 != null && t2 !=null){
            if(t1.data <= t2.data){
                if(head == null){
                    head = t1;
                    tail = t1;
                }else{
                    tail.next = t1;
                    tail = t1;
                }
                t1 = t1.next;
            }else if(t1.data > t2.data) {
                if(head == null){
                    head = t2;
                    tail = t2;
                }else{
                    tail.next = t2;
                    tail = t2;
                }
                t2 = t2.next;
            }  
        }

        if(t1 != null){
            tail.next = t1;
        }else{
            tail.next = t2;
        }
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

    public static void printLL(Node<Integer> head){
        if(head == null){
            return;
        }

        System.out.print(head.data + " ");
        printLL(head.next);
    }

    public static void main(String[] args) {
        Node<Integer> list1 = takeInput();
        Node<Integer> list2 = takeInput();
        Node<Integer> head = mergeTwoSortedLL(list1, list2);

        printLL(head);
    }
}
