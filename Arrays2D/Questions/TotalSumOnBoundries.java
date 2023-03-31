package Arrays2D.Questions;
import java.util.*;

public class TotalSumOnBoundries{
    public static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of colums");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.println("Enter " + i +"th row " + j+"th column");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static int totalBoundariesSum(int arr[][]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][]=takeInput();
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = totalBoundariesSum(arr);
        System.out.println(sum);
    }
}

// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20
// 21 22 23 24 25