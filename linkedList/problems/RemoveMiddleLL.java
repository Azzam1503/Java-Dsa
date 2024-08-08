package linkedList.problems;

public class RemoveMiddleLL {
    public static void remove(Node head) {
        Node fast = head.next.next;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ;

        slow.next = slow.next.next;

    }

    public static void main(String[] args) {
        Node head = PrintAndInput.takeLlInput();
        PrintAndInput.printLL(head);
        remove(head);
        PrintAndInput.printLL(head);

    }
}
