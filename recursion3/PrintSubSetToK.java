package recursion3;

public class PrintSubSetToK {
    public static void print(int []input, int index, int k, int[] output){
        if(index == input.length){
            if(k==0){
                for(int i:output){
                    System.out.print(i + " ");
                }
                System.out.println();
                return;
            }else{
                return;
            }
        }

        int[] newOutput = new int[output.length + 1];
        int j=0;
        for(int i=0; i<output.length; i++){
            newOutput[j] = output[i];
            j++;
        }
        newOutput[j] = input[index];
        print(input, index + 1, k,output);
        print(input, index + 1, k-input[index], newOutput);
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 5, 6};
        int arr2[] = new int[0];

        print(arr, 0, 8, arr2);
    }
}
