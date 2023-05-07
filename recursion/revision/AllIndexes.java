package recursion.revision;

public class AllIndexes {
    public static void print(int arr[], int index, int element){
        if(index == arr.length){
            return; 
        }

        if(arr[index]==element){
            System.out.print(index + " ");
        }

        print(arr, index + 1, element);
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 7, 5, 6, 3, 6};
        print(arr, 0, 6);
    }
}
