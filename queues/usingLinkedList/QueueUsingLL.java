package queues.usingLinkedList;
import linkedList.Node;
import queues.usingArrays.QueueEmptyException;

public class QueueUsingLL<T> {
    private Node<T> front;
    private Node<T> rear;

    int size = 0;
    QueueUsingLL(){
        front = null;
        rear = null;
        size = 0;;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void enqueue(T ele){
        Node<T> currentNode = new Node<>(ele);
        size +=1;
        if(front == null){
            front = currentNode;
            rear = currentNode;
            return;
        }

        rear.next = currentNode;
        rear = currentNode;
    }

    public T front() throws QueueEmptyException{
        if(this.isEmpty()){
            throw new QueueEmptyException();
        }
        return front.data;
    }

    public T dequeue() throws QueueEmptyException{
        if(this.isEmpty()){
            throw new QueueEmptyException();
        }
        T temp = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        size--; 
        return temp;
    }
}
