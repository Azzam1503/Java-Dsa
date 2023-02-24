package array.practice;

public class sort01 {
    public static void sort(int arr[]){
        int nextZero=0;
        int i = 0;
        
        while(i<arr.length){
            if(arr[i]==0){
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                nextZero++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 1, 1, 0, 0};
        sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
