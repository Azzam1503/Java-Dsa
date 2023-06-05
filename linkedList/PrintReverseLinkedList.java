package linkedList;

public class PrintReverseLinkedList {
    public static void reverse(Node head){
        if(head == null){
            return;
        }

        reverse(head.next);
        System.out.print(head.data + " ");
    }
    public static Node<Integer> ll(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        System.out.println(n1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    public static void main(String[] args) {
        Node<Integer> head = ll();
        reverse(head);
    }
}
