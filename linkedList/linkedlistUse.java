package linkedList;

public class linkedlistUse {

    public static Node<Integer> creatLinkedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        return n1;
        
    }
    public static void main(String[] args) {

        Node<Integer> head = creatLinkedList();
        
        Node<Integer> n1 = new Node<>(23);
        System.out.println(n1);
        System.out.println(n1.data);
    }
}
