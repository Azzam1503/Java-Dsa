package array.practice;

public class pairs {
    public static void pair(int arr[], int x){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == x){
                    System.out.println("(" + arr[i]+","+arr[j]+")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 3, 4};
        pair(arr, 7);
    }
}
