package stack.questions;

import java.util.Stack;

public class StockSpan {
    
    public static int[] stockSpan(int[] price){
        Stack<Integer> stk = new Stack<>();
        int n = price.length;
        int output[] = new int[n];

        stk.push(0);
        output[0] = 1;
        for(int i=1; i<n; i++){
            while(!stk.isEmpty() && price[stk.peek()] < price[i]){
                stk.pop();
            }

            if(stk.isEmpty()){
                output[i] = i+1;
            }else{
                output[i] = i - stk.peek();
            }

            stk.push(i);
        }
        return output;
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 7, 10, 7, 7, 12, 16};
        int[] arr2 = stockSpan(arr);
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
}
