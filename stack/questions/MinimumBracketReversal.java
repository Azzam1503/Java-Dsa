package stack.questions;

import java.util.Stack;

public class MinimumBracketReversal {
    public static int minimumBracketReversal(String brackets){
        int len = brackets.length();
        if(len ==0){
            return 0; 
        }

        if(len % 2 != 0){
            return -1;
        }
        int count = 0;
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<brackets.length(); i++){
            if(brackets.charAt(i) == '{'){
                stk.push(brackets.charAt(i));
            }else{
                if( !stk.isEmpty() && stk.peek() == '{'){
                    stk.pop();
                }else{
                    stk.push(brackets.charAt(i));
                }
            }
        }

        while(!stk.isEmpty()){
            char c1 = stk.pop();
            char c2 = stk.pop();
            if(c1 != c2){
                count += 2;
            }else{
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String brackets = "}}}{";
        int minimumBracketReversal = minimumBracketReversal(brackets);
        System.out.println(minimumBracketReversal);
    }
}
