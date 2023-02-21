package searchingSorting;

public class megeSort {
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] merSort(int[] arr1, int[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int i =0;
        int j=0;
        int k=0;
        int arr[] = new int[m+n];

        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                arr[k] = arr1[i];
                i++;
                k++;
            }else{
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i<m){
            arr[k] = arr1[i];
            k++;
            i++;
        }
        while(j<n){
            arr[k] = arr[j];
            k++;
            i++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 4, 8, 10, 13, 17};
        int arr2[] = {2, 3, 5, 7, 9, 11, 12};

        int arr3[] = merSort(arr1, arr2);
        printArr(arr3);
    }
}
