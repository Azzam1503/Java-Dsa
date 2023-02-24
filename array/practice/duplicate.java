package array.practice;

public class duplicate {
    public static int dupl(int[] arr){
        for(int i =0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[j];
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 9, 6, 3, 7};
        int dup = dupl(arr);
        System.out.println(dup);
    }
}
