package recursion.PractieQuestions;

public class CountZer0 {
    public static int count(int x){
        if(x < 10){
            if(x==0){
                return 1;
            }else{
                return 0;
            }
        }
        if(x%10==0){
            return count(x/10)+1;
        }else{
            return count(x/10);
        }
    }

    public static void main(String[] args) {
        System.out.println(count(12020));
    }
}
