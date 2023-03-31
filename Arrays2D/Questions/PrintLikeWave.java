package Arrays2D.Questions;

public class PrintLikeWave {
    public static int[] printLike(int arr[][]){
        int arr2[]={2, 3, 4};
        int rows =arr.length;
        int cols= arr[0].length;
        for(int i=0; i<cols; i++){
            if(i%2==0){
                for(int j=0; j<rows; j++){
                    System.out.print(arr[j][i] + " ");
                }
            }else{
                for(int j=rows-1; j>=0; j--){
                    System.out.print(arr[j][i] + " ");
                }
            }
        }
        return arr2;
    }
    public static void main(String[] args) {
        int arr[][]= {{32, 31, 44},{21, 34, 54}, {22, 56, 78}};
        printLike(arr);
    }
}
