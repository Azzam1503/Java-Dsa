package linkedList.problems;

public class SortLL012 {
    public static Node sort(Node head) {
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        Node temp = head;
        while (temp != null) {
            if (temp.val == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.val == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;

            }
            ;
            temp = temp.next;
        }

        zero.next = oneHead.next == null ? twoHead.next : oneHead.next;
        one.next = twoHead.next;
        two.next = null;
        return zeroHead.next;
    }

    public static void main(String[] args) {
        Node head = PrintAndInput.takeLlInput();
        PrintAndInput.printLL(head);
        Node ans = sort(head);
        PrintAndInput.printLL(ans);
    }
}
