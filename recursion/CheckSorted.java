package recursion;

public class CheckSorted {
    public static boolean check(int []arr){
       if(arr.length <=1){
        return true;
       }

       int smallArr[] = new int [arr.length-1];
       for(int i=1; i<arr.length; i++){
            smallArr[i -1] = arr[i];
       }
       boolean smallAns = check(smallArr);
       if(!smallAns){
        return false;
       }

       if(arr[0] > arr[1]){
        return true;
       }else{
        return false;
       }
    }

    public static boolean checkBetterSolution(int arr[], int startIndex){
        if(startIndex >= arr.length-1){
            return true;
        }

        if(arr[startIndex] > arr[startIndex+1]){
            return false;
        }

        boolean smallAns = checkBetterSolution(arr, startIndex +1);
        return smallAns;
    }

    public static boolean checkBetterSolution(int arr[]){
        return checkBetterSolution(arr, 0);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 4};

        System.out.println(check(arr));
        System.out.println(checkBetterSolution(arr));
   }
}
