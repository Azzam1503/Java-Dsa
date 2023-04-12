package recursion;

public class FindAllIndexes {
    public static int[] allIndexes(int arr[], int x, int startIndex){
        if(startIndex == arr.length){
            int output[] = new int[0];
            return output;
        }

        int[] smallOutput = allIndexes(arr, x, startIndex +1);
            if(arr[startIndex]== x){
                int[] output = new int[smallOutput.length + 1];
                output[0] = startIndex;

                for(int i=0; i<smallOutput.length; i++){
                    output[i+1] = smallOutput[0];
                }
                return output;
            }else{
                return smallOutput;
            }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 4, 2, 5,2};
        int[] arr2 = allIndexes(arr, 2, 0);

        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
} 
