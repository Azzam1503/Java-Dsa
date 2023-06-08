package stack.usingLinkedList;

import stack.StackEmptyException;

public class StackUse {
    public static void main(String[] args) throws StackEmptyException {
        StackUsingLinkedLIst<Integer> stack = new StackUsingLinkedLIst<>();
        int[] arr = {5, 4, 1, 7, 9};
        
        for(int i=0; i<arr.length; i++){
            stack.push(arr[i]);
        }

        while(! stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

}
