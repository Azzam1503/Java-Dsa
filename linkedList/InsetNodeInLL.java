package linkedList;

import java.util.Scanner;

import javax.sound.midi.MidiChannel;

public class InsetNodeInLL {
    
    public static Node<Integer> insertNode(Node<Integer> head, int position, int element){
        Node<Integer> nodeToBeInstered = new Node<>(element);
        
        if(position == 0){
            nodeToBeInstered.next = head;
            return nodeToBeInstered;
        }else{
            int index = 0;
            Node<Integer> prev = head;
            while(prev != null && index<position-1){
                index++;
                prev = prev.next;
            }
            
            if(prev != null){
                nodeToBeInstered.next = prev.next;
                prev.next = nodeToBeInstered;
            }
            return head;
        }
        
    }

    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        Node<Integer> head = null, tail = null;

        while(data != -1){
            Node<Integer> currentNode = new Node<>(data);
            if(head == null){
                head = currentNode;
                tail = currentNode; 
            }else{
                tail.next = currentNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;

    }

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = insertNode(head, 2, 56);
        print(head);
    }
}
