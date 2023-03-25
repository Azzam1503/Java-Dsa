package searchingSorting.practice;

public class selecSort {
    public static void printArr(int[] arr){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            for(int j=i; j<arr.length; j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {33, 12, 14, 55, 1, 0, 5};
        System.out.println("Array before sorting");
        printArr(arr);
        selectionSort(arr);
        System.out.println("Array after sorting");
        printArr(arr);
        System.out.println(12/10);
    }
}
