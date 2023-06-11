package queues.usingArrays;

public class QueueUsingArray{
    private int data[];
    private int front;
    private int rear;
    private int size;

    public QueueUsingArray(){
        data = new int[5];
        front = -1;
        rear = -1; 
    }

    // public QueueUsingArray(int capacity){
    //     data = new int[capacity];
    //     front = -1;
    //     rear = -1;
    // }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int element){
        if(size == data.length){
            doubleCapacity();
        }
        if(size == 0){
            front = 0;
        }
        // rear++;
        // if(rear == data.length){
        //     rear = 0;
        // }
        rear = (rear + 1) % data.length; //instead of above four commented lines.
 
        data[rear] = element;
        size++;
    }

    public void doubleCapacity(){
        int temp[] = data;
        data = new int[size*2];
        int index=0;
        for(int i=front; i<temp.length; i++){
            data[index++] = temp[i];
        }

        for(int i=0; i<front-1; i++){
            data[index++] = temp[i];
        }

        front = 0; 
        rear = temp.length-1;
    }

    public int front(){
        return data[front];
    }

    public int dequeue() throws QueueEmptyException{
        if(size == 0 ){
            throw new QueueEmptyException();
        }
        int temp = data[front];
        // front++;
        // if(front == data.length){
        //     front = 0;
        // }
        front = (front + 1) % data.length; //instead of above four commented lines.

        size--;
        if(size==0){
            front = -1;
            rear = -1;
        }
        return temp;
    }



}
