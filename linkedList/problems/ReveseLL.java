package linkedList.problems;

public class ReveseLL {
    public static Node reverse(Node head) {
        Node temp = head, prev = null, next = null;
        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        return prev;
    }

    public static Node reverseRecursive(Node head) {
        if (head == null || head.next == null)
            return head;
        Node smallHead = reverseRecursive(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return smallHead;
    }

    public static void main(String[] args) {
        Node head = PrintAndInput.takeLlInput();
        PrintAndInput.printLL(head);
        Node ans = reverseRecursive(head);
        PrintAndInput.printLL(ans);
    }
}
