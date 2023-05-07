package recursion.revision;

public class ArraySum {
    public static int arrSum(int arr[], int n){
        if(n == arr.length){
            return 0;
        }

       return arr[n] + arrSum(arr, n+1);
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 2};
        System.out.println(arrSum(arr, 0));
    }
}
