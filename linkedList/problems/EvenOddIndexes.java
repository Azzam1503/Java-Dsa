package linkedList.problems;

public class EvenOddIndexes {
    public static Node arrangeIndexes(Node head) {
        if (head == null || head.next == null || head.next.next == null)
            return head;
        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        Node head = PrintAndInput.takeLlInput();
        PrintAndInput.printLL(head);
        Node ans = arrangeIndexes(head);
        PrintAndInput.printLL(ans);

    }
}
