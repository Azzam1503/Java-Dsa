package Arrays2D;
import java.util.*;

public class LargestColumnSum {
    public static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("ENter the nnumber of columns");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.println("Enter " + i+"th row " + j +"jt colum" );
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static int largestColSum(int arr[][]){
        int rows = arr.length;
        int cols = arr[0].length;
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<cols; i++){
            int sum =0;
            for(int j=0; j<rows; j++){
                sum += arr[j][i];
            }
            if(sum > largest){
                largest = sum;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[][]= takeInput();
        int largest = largestColSum(arr);   
        System.out.println(largest);
    }
}
