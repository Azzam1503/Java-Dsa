package linkedList.practice;
import java.util.Scanner;

public class DeleteNNodes {
    public static Node<Integer> deleteNNodes(Node<Integer> head, int m, int n){
        if(m == 0 || head == null){
            return null;
        }
        if(n==0){
            return head;
        }
        Node<Integer> currentNode = head;
        Node<Integer> temp = null;
        while(currentNode != null){
            int keep =0;
            int skip =0;
            while(currentNode != null && keep<m){
                if(temp == null){
                    temp = currentNode;
                }else{
                    temp.next = currentNode;
                    temp = currentNode;
                }
                currentNode = currentNode.next;
                keep++;
            }

            while(currentNode != null && skip<n){
                currentNode = currentNode.next;
                skip++;  
            }
            
        }
        if(temp != null){
            temp.next = null;
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
        Node<Integer> head = takeInput();
        head = deleteNNodes(head, 2, 0);
        printLL(head);
    }
}
