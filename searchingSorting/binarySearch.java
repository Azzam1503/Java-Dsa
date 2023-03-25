package searchingSorting;

import java.util.*;

import array.inputInArray;

public class binarySearch {

    public static int[] arrInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int binSearch(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search");
        int ele = sc.nextInt();
        int start = 0; 
        int end=arr.length-1;
        int mid;

        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid]>ele){
                mid = end-1;
            }else if(arr[mid]<ele){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;

        
    }    
    public static void main(String[] args) {
        int arr[] = arrInput();
        System.out.println(binSearch(arr)); 

    }
}
