package array.practice;

public class triplets {
    public static void trip(int arr[], int x){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i]+arr[j]+arr[k] == x){
                        System.out.println("(" + arr[i]+","+arr[j]+","+arr[k]+")");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 4, 5, 6, 7 };
        trip(arr, 12);
    }
}
