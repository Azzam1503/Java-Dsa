package queues.questions;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void reverse(Queue<Integer> input){
        if(input.size()<=1){
            return;
        }

        int front = input.poll();
        reverse(input);
        input.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        int arr[] = {10, 20, 30, 40};

        for (int i = 0; i < arr.length; i++) {
            q1.add(arr[i]);
        }

        reverse(q1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(q1.poll());
        }
    }

}
