package queues.usingArrays;

public class QueueUse {
    public static void main(String[] args) throws QueueEmptyException, QueueFullException {
        QueueUsingArray queue = new QueueUsingArray();
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        for(int i=0; i<arr.length; i++){
            queue.enqueue(arr[i]);
        }

        while(! queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
        
    }
}
