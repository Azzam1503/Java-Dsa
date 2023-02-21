package searchingSorting.practice;

public class binSrch {
    public static int binarySearch(int[] arr, int ele){
        int start = 0;
        int end= arr.length-1;
        
        while(start<=ele){
            int mid = (end+start)/2;
            if(arr[mid] > ele){
                end = mid-1;
            }else if(arr[mid]< ele){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {12, 15, 34, 44, 66};
        int index = binarySearch(arr, 66);
        System.out.println("The element you are searching is at Index: "+index);
    }
}
