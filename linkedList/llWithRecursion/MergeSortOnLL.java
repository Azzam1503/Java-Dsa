package linkedList.llWithRecursion;

import java.util.Scanner;

public class MergeSortOnLL {
    public static Node<Integer> midOfLL(Node<Integer> head){
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);

        Node<Integer> head = null, tail = null;
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> curNode = new Node<>(data);
            if(head == null){
                head = curNode;
                tail = curNode;
            }else{
                tail.next = curNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void printLL(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node<Integer> merge(Node<Integer> list1, Node<Integer> list2){
        if(list1 == null){
            return list2;
        }

        if(list2 == null){
            return list1;
        }

        Node<Integer> t1 = list1;
        Node<Integer> t2 = list2;
        Node<Integer> head = null, tail = null;

        while(t1 != null && t2 != null){
            if(t1.data <= t2.data){
                if(head == null){
                    head = t1;
                    tail = t1;
                }else{
                    tail.next = t1;
                    tail = t1;
                }
                t1 = t1.next;

            }else{
                if(head == null){
                    head = t2;
                    tail = t2;
                }else{
                    tail.next = t2;
                    tail = t2;
                }
                t2 = t2.next;
            }
        }

        if(t1 != null){
            tail.next=t1;
        }else{
            tail.next = t2;
        }

        return head;
    }

    public static Node<Integer> mergeSort(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> mid = midOfLL(head);
        Node<Integer> list1 = head;
        Node<Integer> list2 = mid.next;
        mid.next = null;

        list1 = mergeSort(list1);
        list2 = mergeSort(list2);

        Node<Integer> finalHead = merge(list1, list2);
        return finalHead;

    }
    public static void main(String[] args) {
        Node<Integer> list1 = takeInput();
        // Node<Integer> list2 = takeInput();
        // Node<Integer> head = merge(list1, list2);
        Node<Integer> merge = mergeSort(list1);
        printLL(merge);

    }
}


