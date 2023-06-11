package queues.questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseTheFirstKElements {
    public static Queue<Integer> reverseFirstk(Queue<Integer> input, int k){
        if(input.isEmpty() || k > input.size()){
            return input;
        }

        if(k<=0){
            return input;
        }
        Stack<Integer> s1 = new Stack<>();
        for(int i=0; i<k; i++){
            s1.push(input.poll());
        }

        while(!s1.isEmpty()){
            input.add(s1.pop());
        }

        for(int i=0; i<input.size()-k; i++){
            input.add(input.poll());
        }
        return input;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Queue<Integer> input = new LinkedList<>();
        for(int i=0; i<arr.length; i++){
            input.add(arr[i]);
        }

        input = reverseFirstk(input, 3);
        System.out.println(input.peek());

        for(int i=0; i<arr.length; i++){
            System.out.println(input.poll());
        }

    }
}
