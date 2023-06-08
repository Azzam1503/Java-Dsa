package stack;

public class StackUse {
    public static void main(String[] args) throws StackEmptyException{
        StackUsingArray stack = new StackUsingArray();
        int arr[] = {1, 2, 3, 4, 5, 6};

        for(int i=0; i<arr.length; i++){
            stack.push(arr[i]);
        }

        while(! stack.isEmpty()){
            System.out.println(stack.pop());
        }
        
    }
}
