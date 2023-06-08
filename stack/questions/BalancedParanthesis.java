package stack.questions;
import stack.StackEmptyException;
import stack.usingLinkedList.StackUsingLinkedLIst;


public class BalancedParanthesis {
    public static boolean checkBalanced(String expression) throws StackEmptyException{
        StackUsingLinkedLIst<Character> stack = new StackUsingLinkedLIst();

        for(int i=0; i<expression.length(); i++){
            if(expression.charAt(i) == '[' || expression.charAt(i) == '{' || expression.charAt(i) == '(' ){
                stack.push(expression.charAt(i));
            }else if(expression.charAt(i) == ')' || expression.charAt(i) == '}' || expression.charAt(i) == ']' ){
                if(stack.isEmpty()){
                    return false;
                }

                char topChar = stack.pop();

                if(expression.charAt(i) == ')' && topChar == '(' || expression.charAt(i) == '}' && topChar == '{'  || expression.charAt(i) == ']' && topChar == '[' ){
                    continue;
                }else{
                    return false;
                }
            } 
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) throws StackEmptyException {
        String expression = "[[{(a+b)+ (a+b)}]]";
        Boolean check = checkBalanced(expression);
        System.out.println(check);
    }
}
