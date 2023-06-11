package recursion3.revision;

public class ReturnSubsets {
    public static int[][] returnSubsets(int[] arr, int si){
        if(si == arr.length){
            int output[][] = new int[1][0];
            return output;
        }

        int[][] smallAns = returnSubsets(arr, si + 1);
        int[][] output = new int[2*smallAns.length][];

        int k=0;

        for(int i=0; i<smallAns.length; i++){
            output[k] = new int[smallAns[i].length];
            for(int j=0; j<smallAns[i].length; j++){
                output[k][j] = smallAns[i][j]; 
            }
            k++;
        }

        for(int i=0; i<smallAns.length; i++){
            output[k] = new int[smallAns[i].length + 1];
            output[k][0] = arr[si];
            for(int j=1; j<=smallAns[i].length; j++){
                output[k][j] = smallAns[i][j-1];
            }
            k++;
        }
        return output;
    }    

    public static int[][] return2(int arr[], int si){
        if(si==arr.length){
            int output[][] = new int[1][0];
            return output;
        }

        int[][] smallAns = return2(arr, si+1);
        int[][] output = new int[2*smallAns.length][];
        int k=0;
        for(int i=0; i<smallAns.length; i++){
            output[k] = new int[smallAns[i].length];
            for(int j=0; j<smallAns[i].length; j++){
                output[k][j] = smallAns[i][j];
            }
            k++;
        }

        for(int i=0; i<smallAns.length; i++){
            output[k] = new int[smallAns[i].length +1];
            output[k][0] = arr[si];
            for(int j=0; j<smallAns[i].length; j++){
                output[k][j+1] = smallAns[i][j];
            }
            k++;
        }
        return output;
    }
    

    public static void main(String[] args) {
        int arr[] = {2, 3, 4};
        int arr2[][]=returnSubsets(arr, 0);
        int arr3[] = {5, 6, 7};
        int arr4[][] = return2(arr3, 0);

        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0; i<arr4.length; i++){
            for(int j=0; j<arr4[i].length; j++){
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }
}