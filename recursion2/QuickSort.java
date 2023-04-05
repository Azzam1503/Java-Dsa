package recursion2;

public class QuickSort {
    public static void quick_sort(int arr[], int startIndex, int endIndex){
        if(startIndex>=endIndex){
            return;
        }

        int partitionIndex = partition(arr, startIndex, endIndex);
        quick_sort(arr, startIndex, partitionIndex -1);
        quick_sort(arr, partitionIndex+1, endIndex);
    }

    public static int partition(int arr[], int startIndex, int endIndex){
        int pivot = arr[startIndex];
        int count = 0;
        for(int i = startIndex +1; i<=endIndex; i++){
            if(arr[i] <= pivot){
                count++;
            }
        }

        int pivotIndex = startIndex + count; 
        arr[startIndex] = arr[pivotIndex];
        arr[pivotIndex] = pivot;

        int i=startIndex, j=endIndex;
        while(i<= pivotIndex && j>pivotIndex){
            if(arr[i]<=pivot){
                i++;
            }else if(arr[j]>pivot){
                j--;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        return pivotIndex;
    }

    
    public static void main(String[] args) {
        int arr[] = {5, 8, 7, 3, 2, 1, 9};
        quick_sort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
