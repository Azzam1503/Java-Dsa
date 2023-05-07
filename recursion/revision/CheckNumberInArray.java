package recursion.revision;

public class CheckNumberInArray {
    public static boolean check(int arr[], int index, int element){
        if(index == arr.length){
            return false;
        }
        
        
        if(arr[index] == element){
            return true;
        }
        return check(arr, index + 1, element);

    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 1, 9};
        System.out.println(check(arr, 0, 2));
    }
}
