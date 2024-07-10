package array.problems;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int arr[], int n, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int remaining = target - arr[i];
            if (map.containsKey(remaining)) {
                return new int[] { map.get(remaining), i };
            }

            map.put(arr[i], i);
        }
        return null;
    }

    public static int[] twoSumBetter(int arr[], int n, int target) {
        int start = 0, end = n - 1;
        Arrays.sort(arr);
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                return new int[] { start, end };
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 5, 8 };
        int ans[] = twoSumBetter(arr, arr.length, 12);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
