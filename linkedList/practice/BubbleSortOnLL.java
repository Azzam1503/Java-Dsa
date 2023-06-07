package linkedList.practice;
import java.util.Scanner;

public class BubbleSortOnLL {
    public static int length(Node<Integer> head){
        int count = 0;
        while(head != null){
            count++;
            head=head.next;
        }
        return count;
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

    public static Node<Integer> bubbleSort(Node<Integer> head){
        int size = length(head);
        
        for(int i=0; i<size-1; i++){
            Node<Integer> curNode = head, prev = null;
            for(int j=0; j<(size-i-1); j++){
                if(curNode.data <= curNode.next.data){
                    prev = curNode;
                    curNode = curNode.next;
                }else{
                    if(prev == null){
                        Node<Integer> fwd = curNode.next;
                        head = head.next;
                        curNode.next = fwd.next;
                        fwd.next = curNode;
                        prev = fwd;
                    }else{
                        Node<Integer> fwd = curNode.next;
                        prev.next = curNode.next;
                        curNode.next = fwd.next;
                        fwd.next = curNode;
                        prev = fwd;
                    }
                } 
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = bubbleSort(head);
        printLL(head);
    }
}
