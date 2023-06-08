package stack.questions;
import stack.StackEmptyException;
import stack.usingLinkedList.StackUsingLinkedLIst;

public class ReverseStack {
    public static void reverseStack(StackUsingLinkedLIst<Integer> input, StackUsingLinkedLIst<Integer> extra) throws StackEmptyException{
        if(input.size() <= 1){
            return;
        }

        int lastElem = input.pop();

        reverseStack(input, extra);

        while(! input.isEmpty()){
            int top = input.pop();
            extra.push(top);
        }

        input.push(lastElem);

        while(! extra.isEmpty()){
            int top = extra.pop();
            input.push(top);
        }
        
    }

    public static void main(String[] args) throws StackEmptyException {
        StackUsingLinkedLIst<Integer> stack = new StackUsingLinkedLIst<>();
        int[] arr = {5, 4, 1, 7, 9};
        
        for(int i=0; i<arr.length; i++){
            stack.push(arr[i]);
        }

        StackUsingLinkedLIst<Integer> stack2 = new StackUsingLinkedLIst<>();
        reverseStack(stack, stack2);

        while(! stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
