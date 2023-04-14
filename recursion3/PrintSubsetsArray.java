package recursion3;

public class PrintSubsetsArray {
    public static void print(int[] input, int index, int[] output){
        if(index == input.length){
            for(int i : output){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        int []newOutput = new int[output.length +1];

        int k=0;
        for(int i=0; i<output.length; i++){
            newOutput[i] = output[k];
            k++;
        }

        newOutput[k] = input[index];

        print(input, index+1, newOutput);
        print(input, index +1, output);
        
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = new int[0];
        print(arr, 0, arr2);
    }
}
