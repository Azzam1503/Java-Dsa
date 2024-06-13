package recursion2;

public class MergeSort {
    public static void merge_sort(int[] arr, int startIndex, int endIndex){

        if(startIndex >= endIndex){
            return;
        }
        
        int mid = (startIndex + endIndex)/2;
        merge_sort(arr, startIndex, mid);
        merge_sort(arr, mid+1, endIndex);

        merge(arr, startIndex, endIndex);
    }

    public static void merge(int[] arr, int startIndex, int endIndex){
        int mid = (startIndex + endIndex )/2;
        int size = endIndex-startIndex+1;
        int ans[] = new int[size];
        
        int i = startIndex;
        int j=mid +1;
        int k=0;

        while(i<=mid && j<=endIndex){
            if(arr[i]<arr[j]){
                ans[k] = arr[i];
                i++;
                k++;
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


        while(j<=endIndex){
            ans[k] = arr[j];
            k++;
            j++;
        }

        for(int index = 0; index < ans.length; index++){
            arr[startIndex + index] = ans[index];
        }
    }

    

    public static void main(String[] args) {
        int[] arr= {8,1};
        merge_sort(arr, 0, 1);
            for(int i=0; i< arr.length; i++){
                System.out.println(arr[i]);
            }

    }
}
