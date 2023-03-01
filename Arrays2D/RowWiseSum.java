package Arrays2D;
import java.util.*;
public class RowWiseSum {
    public static int[][] inputArray2d(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of cols");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.println("Enter " +i+"th row " + j +"th colum");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void printArr2d(int arr[][]){
        int rows = arr.length;
        int cols = arr[0].length;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void rowWiseSum(int arr[][]){
        int rows= arr.length;
        for(int i=0; i<rows; i++){
            int sum =0;
            for(int j=0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
            System.out.print(sum+" ");
        }
    }

    public static void main(String[] args) {
        int arr[][] = inputArray2d(); 
        printArr2d(arr);

        rowWiseSum(arr);
    }
}
