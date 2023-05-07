package recursion.revision;

public class LastIndex {
    public static int last(int[] arr, int element, int index){
        if(index < 0){
            return -1;
        }

        if(arr[index] == element){
            return index;
        }

        return last(arr, element, index-1);
    }

    public static int last2(int[] arr, int element, int index){
        if(index == arr.length){
            return -1;
        }

        int smallAns = last2(arr, element, index + 1);
        if(smallAns !=-1){
            return smallAns;
        }
        if(arr[index] == element){
            return index;
        }else{
            return -1;
        }

    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 6, 6, 7};
        System.out.println(last(arr, 6, arr.length-1));
        System.out.println(last2(arr, 6, 0));
    }
}
