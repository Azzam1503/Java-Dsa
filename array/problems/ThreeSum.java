package array.problems;

import java.util.*;

// sum of three elements of array equals to 0

public class ThreeSum {

    public static List<List<Integer>> threeSum(int arr[], int n) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> inner = new ArrayList<>();
                    inner.add(arr[i]);
                    inner.add(arr[j]);
                    inner.add(arr[k]);
                    list.add(inner);
                    j++;
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }

                    k--;
                    while (k > j && arr[k] == arr[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // int arr[] = { -2, -2, -2, -1, -1, -1, 0, 0, 0, 2, 2, 2 };
        int arr[] = { 1, -1, -1, 0 };
        List<List<Integer>> list = threeSum(arr, arr.length);

        for (List<Integer> i : list) {
            System.out.println(i);
        }
    }
}
