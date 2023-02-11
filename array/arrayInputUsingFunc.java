package array;
import java.util.*;

public class arrayInputUsingFunc {
    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }

    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the value of " + i + "th index" );
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = inputArray();
        printArr(arr);
    }
}
