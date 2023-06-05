package linkedList.practice;
import java.util.LinkedList;
import java.util.Scanner;

public class FindNodeRecursion {

    public static int findNode(LinkedList<Integer> list, int pos, int element){
        if(list == null){
            return -1;
        }

        if(list.get(pos) == element){
            return pos;
        }

        return findNode(list, pos+1, element);
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while(data != -1){
            list.add(data);
            data = sc.nextInt();
        }

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        
        System.out.println();

        int pos = findNode(list, 0, 40);
        System.out.println(pos);
    }
}
