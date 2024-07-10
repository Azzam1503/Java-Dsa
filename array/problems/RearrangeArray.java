package array.problems;

import java.util.ArrayList;

public class RearrangeArray {
    public static int[] rearrangeArray(int arr[], int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }

        int ans[] = new int[n];
        for (int i = 0; i < n / 2; i++) {
            ans[i * 2] = pos.get(i);
            ans[i * 2 + 1] = neg.get(i);
        }
        return ans;
    }

    public static int[] rearrangeArrayBetter(int arr[], int n) {
        int nextPosInd = 0;
        int nextNegInd = 1;

        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans[nextPosInd] = arr[i];
                nextPosInd += 2;
            } else {
                ans[nextNegInd] = arr[i];
                nextNegInd += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -2, 4, -3, -9 };
        int n = arr.length;
        int arr2[] = rearrangeArrayBetter(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr2[i]);
        }
    }
}
