package stack.questions;

import java.util.Stack;

public class CheckRedundantBrackets {
    public static boolean checkRedundantBrackets(String expression){
        int len = expression.length();
        if(len == 0){
            return false;
        }
        int count =0;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<len; i++){
            char current = expression.charAt(i);
            count=0;
            if(current != ')'){
                stack.push(current);
            }else{
                    while(!stack.isEmpty() && stack.peek() != '('){
                        stack.pop();
                        count++;
                    }
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
            }
        }
        if(count == 0){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        String expression = "(a+b)";
        boolean check = checkRedundantBrackets(expression);
        System.out.println(check);
    }
}
