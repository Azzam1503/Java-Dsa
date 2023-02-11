package array;

import java.util.*;

public class inputInArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int[] arr = new int[n];
        
        // for(int i =0; i<n; i++){
        //     System.out.println("Enter the value for" + i +"th index");
        //     arr[i] = sc.nextInt();
        // }
        // for(int i =0; i<n; i++){
        //     System.out.println(arr[i]);
        // }

            int arr[] = new int[n];

            for(int i = 0; i<n; i++){
                System.out.println("Enter the vale of" + i+"th index");
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i<n; i++){
                System.out.println(arr[i]);
            }

    }
}
