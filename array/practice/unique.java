package array.practice;

public class unique {
    public static int uniq(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i] != arr[j]){
                    return arr[j];
                }
            }
        }
    }
}
