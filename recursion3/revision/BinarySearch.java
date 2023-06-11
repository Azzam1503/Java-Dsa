package recursion3.revision;

public class BinarySearch {
    

    public static int search(int arr[], int si, int ei, int element){
        if(si>=ei){
            return -1;
        }

        int mid = (si + ei)/2;

        if(arr[mid] == element){
            return mid;
        }else if(arr[mid] > element){
            return search(arr, si, mid-1, element);
        }else{
            return search(arr, mid+1, ei, element);
        }

    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 7, 8, 12};
        System.out.println(search(arr, 0, arr.length-1, 8));
    }
}
