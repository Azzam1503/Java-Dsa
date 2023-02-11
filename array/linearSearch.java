package array;
import java.util.*;

public class linearSearch {
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value of " + i + "th index");
            arr[i] = sc.nextInt();    
        }
        return arr;
    }

    public static int linearSrch(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to find");
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(x==arr[i])   {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        int linearSearch = linearSrch(arr);
        System.out.println(linearSearch);
    }
}
