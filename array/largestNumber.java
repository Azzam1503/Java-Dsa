package array;

import java.util.Scanner;

public class largestNumber {
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

    public static int larestNumber(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max= arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.println(larestNumber(arr));
        
    }
}
