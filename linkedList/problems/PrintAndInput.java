package linkedList.problems;

import java.util.Scanner;

public class PrintAndInput {
    public static Node takeLlInput() {
        Scanner s = new Scanner(System.in);
        Node head = null, tail = null;
        int data = s.nextInt();
        while (data != -1) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
            data = s.nextInt();
        }
        s.close();
        return head;
    }

    public static void printLL(Node head) {
        if (head == null)
            return;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
