package recursion3.revision;

public class PrintSubsetSumToK {
    public static void print(int arr[], int k, int si, int[] outSoFar){
        if(si == arr.length){
            if(k==0){
                for(int i : outSoFar){
                    System.out.print(i+" ");
                }
                System.out.println();
                return;
            }else{
                return;
            }
        }

        int[] newOutput = new int[outSoFar.length +1];
        int i=0; 
        for(; i<outSoFar.length; i++){
            newOutput[i] = outSoFar[i];
        }

        newOutput[i] = arr[si];
        print(arr, k, si+1, outSoFar);
        print(arr, k-arr[si], si+1, newOutput);
    }

    public static void main(String[] args) {
        int arr[] = {2,1, 2,3};
        int arr2[] = new int[0];
        print(arr, 4, 0, arr2);
    }
}
