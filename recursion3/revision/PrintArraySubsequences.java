package recursion3.revision;

import array.inputInArray;

public class PrintArraySubsequences {
    
    public static void print(int[] arr, int si, int[] output){
        if(si == arr.length){
            for(int i=0; i<output.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        int newOutput[] = new int[output.length +1];
        int i=0; 
        for(;i<output.length; i++){
            newOutput[i] = output[i];
        }

        newOutput[i] = arr[si];

        print(arr, si+1, output);
        print(arr, si+1, newOutput);
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4};
        int output[] = new int[0];

        print(arr, 0, output);
    }

}
