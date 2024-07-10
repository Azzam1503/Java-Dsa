package array.problems;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static int longestConsecutiveSub(int arr[], int n) {
        Arrays.sort(arr);
        int longest = 1;
        int lastSmallest = Integer.MIN_VALUE;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == lastSmallest) {
                cnt++;
                lastSmallest = arr[i];
            } else if (lastSmallest != arr[i]) {
                lastSmallest = arr[i];
                cnt = 1;
            }

            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static int longestConsecutiveSubBetter(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        int longest = 1;
        for (Integer i : set) {
            int count = 1;
            int x = i;
            if (set.contains(x + 1)) {
                while (set.contains(x + 1)) {
                    count++;
                    x++;
                }
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 110, 111, 3, 112, 4, 7, 11, 113, 114, 115 };
        int n = arr.length;
        int ans = longestConsecutiveSubBetter(arr, n);
        System.out.println(ans);
    }
}
