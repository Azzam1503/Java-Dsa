package searchingSorting;

public class selectionSort {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);    
        }
    }

    public static void selecSort(int arr[]){
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
        int arr[] = {3, 2, 0, 1, 6, 5};
        printArr(arr);
        selecSort(arr);
        System.out.println("Array Sorted by selection Sort: ");
        printArr(arr);
    }
}
