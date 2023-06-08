package stack.usingLinkedList;
import linkedList.Node;
import stack.StackEmptyException;

public class StackUsingLinkedLIst<T> {
    Node<T> head;
    private int size;

    StackUsingLinkedLIst(){
        size =0;
        head = null;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void push(T elem){
        Node<T> newNode = new Node<T>(elem);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T top() throws StackEmptyException{
        if(head == null ){
            throw new StackEmptyException();
        }
        return head.data;
    }

    public T pop() throws StackEmptyException{
        if(head == null ){
            throw new StackEmptyException();
        }

        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }

}
