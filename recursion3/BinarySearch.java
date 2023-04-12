package recursion3;

public class BinarySearch {
    public static int search(int[] input, int start, int end, int element){
        if(start>end){
            return -1;
        }

        int mid = (start+end)/2;
        if(input[mid] == element){
            return mid;
        }else if(element > input[mid]){
            return search(input, mid +1, end, element);
        }else{
            return search(input, start, mid-1, element);
        }
    
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 12, 17, 21};
        System.out.println(search(arr, 0, arr.length-1, 21));
    }
}
