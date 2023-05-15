package linkedList;

public class ithNode {
    public static Node<Integer> createLinkedList(){
        Node<Integer> n1 = new Node<>(12);
        Node<Integer> n2 = new Node<>(13);
        Node<Integer> n3 = new Node<>(14);
        Node<Integer> n4 = new Node<>(15);
        Node<Integer> n5 = new Node<>(16);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        return n1;
    }


    public static void ith(Node<Integer> head, int index){
        Node<Integer> temp = head;
        int count=0;
        while(temp != null && count < index){
            temp = temp.next;
            count++;
        }

        if(temp != null){
            System.out.println(temp.data);
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        ith(head, 0);
    }
}
