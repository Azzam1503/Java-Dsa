package searchingSorting;

public class insertionSort {
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int j = i-1;
            int temp = arr[i];

            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {13, 5, 12, 8, 19, 21, 1, 3 };
        System.out.println("Array before sorting");
        printArr(arr);
        insertSort(arr);
        System.out.println("Array after insertion sort");
        printArr(arr);
    }
}
