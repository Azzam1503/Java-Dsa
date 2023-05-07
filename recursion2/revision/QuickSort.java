package recursion2.revision;

public class QuickSort {
    public static int partition(int arr[], int start, int end){
        int pivot = arr[start];

        int count =0;

        for(int i = start +1; i<end; i++){
            if(arr[i] <= pivot){
                count++;
            }
        }

        int pivotIndex = start + count;
        arr[start] = arr[pivotIndex];
        arr[pivotIndex] = pivot;

        int i=start, j = end;

        while(i<=pivotIndex && j>pivotIndex){
            if(arr[i]<pivot){
                i++;
            }else if(arr[j] > pivot){
                j--;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return pivotIndex;
    }
    public static void quickSort(int arr[], int start, int end){
        if(start>=end){
            return;
        }

        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1,end);
    }

    public static void main(String[] args) {
        int arr[] = {5, 8, 7, 2, 3, 1, 9};
        quickSort(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
