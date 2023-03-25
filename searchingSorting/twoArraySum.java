package searchingSorting;

public class twoArraySum {
    public static int[] sum(int arr1[], int[] arr2){
        int i = arr1.length-1;
        int j= arr2.length-1;
        int[] output = new int[Math.max(arr1.length, arr2.length)];
        int k = Math.max(arr1.length-1, arr2.length-1);
        int carry = 0;
       while(i>=0 && j>=0){
        int sum = arr1[i] + arr2[j] + carry;
        output[k] = sum%10;
        carry = sum/10;

        k--;
        i--;
        j--;
       }

       while(i>=0){
            int sum = arr1[i] + carry;
            output[k] = sum%10;
            carry = sum/10;
            k--;
            i--;
        }
        while(j>=0){
            int sum = arr2[i] + carry;
            output[k] = sum%10;
            carry = sum/10;

            k--;
            j--;
        }
        return output;
    }
    public static void main(String[] args) {
        int arr1[] = {2, 4, 6, 7, 3, 6};
        int arr2[] = {1, 3, 5, 3};
        int []arrSum = sum(arr1, arr2);

        for(int i=0; i<arrSum.length; i++){
            System.out.print(arrSum[i] + " ");
        }
    }
}
