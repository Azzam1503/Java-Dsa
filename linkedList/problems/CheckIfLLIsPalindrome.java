package linkedList.problems;

import java.util.Stack;

import linkedList.InputLL;
import linkedList.Node;

public class CheckIfLLIsPalindrome {

    public static boolean checkIfPalindrome(Node<Integer> head) {
        Stack<Integer> s = new Stack<>();
        Node<Integer> temp = head;
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {
            if (temp.data != s.pop()) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public static Node<Integer> reverseLL(Node<Integer> head) {
        if (head == null || head.next == null)
            return head;
        Node<Integer> temp = head;

        Node<Integer> prev = null;
        Node<Integer> next = null;
        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;

    }

    public static boolean checkIfPalindromeBetter(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node<Integer> secondHalfHead = reverseLL(slow.next);
        Node<Integer> firstHalf = head;
        Node<Integer> secondHalf = secondHalfHead;
        InputLL.print(secondHalf);
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        reverseLL(secondHalfHead);

        return true;
    }

    public static void main(String[] args) {
        Node<Integer> head = InputLL.input();
        InputLL.print(head);
        System.out.println(checkIfPalindromeBetter(head));
        InputLL.print(head);
    }
}
