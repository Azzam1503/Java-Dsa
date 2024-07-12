package array.problems;

import java.util.HashMap;

public class NoOfSubarrayWithSumK {

    public static int noOfSubarray(int arr[], int k) {
        int n = arr.length;
        int prefixSum = 0;
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(prefixSum, 1);

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            int remove = prefixSum - k;

            cnt += map.getOrDefault(remove, 0);

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return cnt;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
        int k = 3;
        int ans = noOfSubarray(arr, k);
        System.out.println(ans);
    }
}
