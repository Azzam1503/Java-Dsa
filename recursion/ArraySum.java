package recursion;

public class ArraySum {
    public static int sum(int []arr, int startIndex){
        if(startIndex == arr.length){
            return 0;
        }
        return arr[startIndex] + sum(arr, startIndex +1);
    }

    public static int sum(int []arr){
        return sum(arr, 0);
    }


    public static void main(String[] args) {
        int arr[] = {1,3,4,5};
        System.out.println(sum(arr, 0));
    }
}
