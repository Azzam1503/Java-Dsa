package recursion3;

public class SubsetOfArray {
    public static int[][] subset(int arr[], int startIndex){
        if(startIndex == arr.length){
            int[][] output = new int[1][0];
            return output;
        }

        int[][] smallOutput = subset(arr, startIndex + 1);
        int[][] output = new int[2 * smallOutput.length][];

        int k=0;
        for(int i=0; i<smallOutput.length; i++){
            output[k] = new int[smallOutput[i].length];
            for(int j=0; j<smallOutput[i].length; j++){
                output[k][j] = smallOutput[i][j];
            }
            k++;
        }

        for(int i=0; i<smallOutput.length; i++){
            output[k] = new int[smallOutput[i].length+1];
            output[k][0] = arr[startIndex];
            for(int j=1; j<=smallOutput[i].length; j++){
                output[k][j]=smallOutput[i][j-1];
            }
            k++;
        }
        return output;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int arrsub[][] = subset(arr, 0);

        for(int i=0; i<arrsub.length; i++){
            for(int j=0; j<arrsub[i].length; j++){
                System.out.print(arrsub[i][j] + " ");
            }
            System.out.println();
        }
    }
}