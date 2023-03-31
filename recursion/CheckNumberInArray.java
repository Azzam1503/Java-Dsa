package recursion;

public class CheckNumberInArray {
    public static boolean checkNum(int arr[], int startIndex, int x){
        if(arr.length == startIndex){
            return false;
        }

        if(arr[startIndex] == x){
            return true;
        }

        return checkNum(arr, startIndex + 1, x);
    }

    public static boolean checkNum(int arr[], int x){
        return checkNum(arr, 0, x);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 8, 11};
        System.out.println(checkNum(arr, 11));
    }
}


