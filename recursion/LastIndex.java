package recursion;

public class LastIndex {
    private static int last(int arr[], int lastIndex, int x){
        if(arr[lastIndex] == x){
            return lastIndex;
        }

        if(lastIndex ==0){
            return -1;
        }

        int smallAns = last(arr, lastIndex -1, x);
        return smallAns;
    }

    public static int last(int arr[], int x){
        return last(arr, arr.length-1, x);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 2, 2, 2};
        System.out.println(last(arr, 2));
    }
}
