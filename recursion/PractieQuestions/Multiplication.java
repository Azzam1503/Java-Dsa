package recursion.PractieQuestions;

public class Multiplication {
    public static int product(int x, int y){
        if(x==0 || y==0){
            return 0;
        }
        return x + product(x, y-1);
    
    }

    public static void main(String[] args) {
        System.out.println(product(7, 2));
    }
}
