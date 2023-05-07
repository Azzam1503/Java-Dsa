package recursion.revision;

public class FirstIndex {
    public static int first(int[] arr, int index, int element){
        if(index >= arr.length){
            return -1;
        }

        if(arr[index] == element){
            return index;
        }

        return first(arr, index + 1, element);
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 3, 6, 7};
        System.out.println(first(arr, 0, 6));
    }
}
