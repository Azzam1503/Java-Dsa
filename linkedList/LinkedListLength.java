package linkedList;

public class LinkedListLength {
    
    public static Node<Integer> createLinkedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(7);
        Node<Integer> n3 = new Node<>(11);
        Node<Integer> n4 = new Node<>(3);
        Node<Integer> n5 = new Node<>(-1);

        n1.next= n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        return n1;
    }

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static int linkedListSize(Node<Integer> head){
        int n=0;
        Node<Integer> temp = head;
        while(temp != null){
            if(temp.data == -1){
                break;
            }
            n++;
            temp = temp.next;
        }
        return n;
    }

    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        print(head);
        System.out.println(linkedListSize(head));
    }
}
