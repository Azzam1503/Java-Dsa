package recursion3.revision;

public class ReturnSubsetSumToK {
    
    public static int[][] returnSubets(int[] arr, int si, int k){
        if(si == arr.length){
            if(k==0){
                int[][] output = new int[1][0];
                return output;
            }else{
                int[][] output = new int[0][0];
                return output;
            }
        }

        int[][] smallOutput1 = returnSubets(arr, si+1, k);
        int[][] smallOutput2 = returnSubets(arr, si+1, k-arr[si]);
        int[][] output = new int[smallOutput1.length+smallOutput2.length][];

        int index=0;


        for(int i=0; i<smallOutput1.length; i++){
            output[index] = smallOutput1[i];
            index++;
        }

        for(int i=0; i<smallOutput2.length; i++){
            output[index] = new int[smallOutput2[i].length +1];
            output[index][0] = arr[si];
            for(int j=0; j<smallOutput2[i].length; j++){
                output[index][j+1] = smallOutput2[i][j];
            }
            index++;
        }

        return output;
    }

    public static void main(String[] args) {
        int arr[] = {2,1, 2,3};
        int[][] arr2 = returnSubets(arr, 0, 4);
        
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
