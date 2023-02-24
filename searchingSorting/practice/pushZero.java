package searchingSorting.practice;

public class pushZero {
    public static void printArr(int[] arr){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void push(int arr[]){
        int nonZero = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[nonZero];
                arr[nonZero]=arr[i];
                arr[i] = temp;
                nonZero++;

            }
        }
        printArr(arr);
    }
    public static void main(String[] args) {
        int arr[] = {2, 0, 0, 1, 3, 0, 0};
        push(arr);
    }
}
