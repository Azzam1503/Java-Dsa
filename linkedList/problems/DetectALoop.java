package linkedList.problems;

public class DetectALoop {
    public static boolean detect(Node head) {
        if (head == null || head.next == null)
            return false;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = PrintAndInput.takeLlInput();
        PrintAndInput.printLL(head);
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = head.next.next;
        boolean ans = detect(head);
        System.out.println(ans);
    }
}
