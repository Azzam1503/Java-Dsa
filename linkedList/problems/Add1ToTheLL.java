package linkedList.problems;

public class Add1ToTheLL {
    public static Node reverseLL(Node head) {
        if (head == null || head.next == null)
            return head;

        Node temp = head;
        Node prev = null;
        Node front = null;

        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }

    public static Node add1toLL(Node head) {
        int carry = 1;
        Node rev = reverseLL(head);
        Node temp = rev;
        while (temp != null) {
            int currval = temp.val + carry;
            temp.val = currval % 10;
            carry = currval / 10;
            if (carry == 0)
                break;

            temp = temp.next;
        }

        if (carry == 0) {
            return reverseLL(rev);
        }
        ;

        Node newHead = new Node(carry);
        newHead.next = rev;
        return newHead;
    }

    public static void main(String[] args) {

        Node head = PrintAndInput.takeLlInput();
        Node head2 = add1toLL(head);
        PrintAndInput.printLL(head2);
    }
}
