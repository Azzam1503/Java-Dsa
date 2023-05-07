package recursion2.revision;

public class MergeSort {
    
    public static void sort(int arr[], int start, int end){
        if(start>=end){
            return;
        }

        int mid = (start + end)/2;

        sort(arr, start, mid);
        sort(arr, mid+1, end);
        merge(arr, start, end);
    }

    public static void merge(int arr[], int start, int end){
        int mid = (start+end)/2;

        int ans[] = new int[end - start +1];

        int i=start;
        int j=mid+1;
        int k=0;
        
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                ans[k] = arr[i];
                k++;
                i++;
            }else{
                ans[k] = arr[j];
                j++;
                k++;
            }
        }

        while(i<=mid){
            ans[k] = arr[i];
            i++;
            k++;
        }

        while(j<=end){
            ans[k] = arr[j];
            j++;
            k++;
        }

        for(int index =0; index<ans.length; index++){
            arr[start + index] = ans[index];
        }
    }

    public static void sort(int arr[]){
        sort(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 2, 1, 3, 4, 7, 11, 9, 8};
        sort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
