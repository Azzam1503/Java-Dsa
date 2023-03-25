package searchingSorting.practice;

public class secondLargest {
    
    public static int secLar(int arr[]){
        if(arr.length ==0){
            return Integer.MIN_VALUE;
        }
        int largest = arr[0]; 
        int seclargest = Integer.MIN_VALUE;
        // for(int i=1; i<arr.length; i++){
        //     if(largest<arr[i]){
        //         seclargest = largest;
        //         largest = arr[i];
        //     }else if(seclargest < arr[i] && arr[i] != largest){
        //         seclargest = arr[i];
        //     }
        // }

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                seclargest = largest;
                largest = arr[i];
            }else if(seclargest < arr[i] && arr[i] !=largest){
                seclargest=arr[i];
            }
        }
        
        return seclargest;
        
    }
    
    public static void main(String[] args) {
        int arr[] = {12, 13, 17, 6, 3, 22};
        int largest = secLar(arr);
        System.out.println(largest); 
    }
}
