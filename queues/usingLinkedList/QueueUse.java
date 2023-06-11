package queues.usingLinkedList;

import queues.usingArrays.QueueEmptyException;

public class QueueUse {
    
    public static void main(String[] args) throws QueueEmptyException {
        QueueUsingLL<Integer> queue = new QueueUsingLL<>();

        int arr[] = {22, 24, 26, 28, 30};
        
        for(int i=0; i<arr.length; i++){
            queue.enqueue(arr[i]);
        }

        System.out.println(queue.size());

        for(int i=0; i<arr.length; i++){
            System.out.println(queue.dequeue());
        }

    }
}
