package recursion;

public class FirstIndex {
    private static int first(int[] arr, int startIndex, int x){
        if(x == arr[startIndex]){
            return startIndex;
        }
        if(startIndex >= arr.length-1){
            return -1;
        }

        int smallAns = first(arr, startIndex + 1, x);
        return smallAns;
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8};
        System.out.println(first(arr, 0, 8));
    }
}
