package linkedList.problems;

public class MiddleOfTheLL {
    public static Node middle(Node head) {
        if (head == null || head.next == null)
            return head;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = PrintAndInput.takeLlInput();
        PrintAndInput.printLL(head);
        Node ans = middle(head);
        System.out.println(ans.val);
    }
}
