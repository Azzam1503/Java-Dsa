package recursion.revision;

public class CheckSorted {
    public static boolean check(int arr[]){
        if(arr.length <= 1){
            return true;
        }

        int smallArr[] = new int[arr.length-1];
        for(int i=1; i<arr.length; i++){
            smallArr[i-1] = arr[i];
        }
        boolean smallAns = check(smallArr);
        if(!smallAns){
            return false; 
        }

        if(arr[0] <= arr[1]){
            return true;
        }else{
            return false;
        }
    }

    public static boolean checkBetter(int arr[], int index){
        if(index >= arr.length-1){
            return true;
        }

        if(arr[index] > arr[index+1]){
            return false;
        }

        boolean smallAns = checkBetter(arr, index+1);
        return smallAns;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 2};
        System.out.println(check(arr));
        System.out.println(checkBetter(arr, 0));
    }
}
