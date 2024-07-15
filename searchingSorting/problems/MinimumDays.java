package searchingSorting.problems;
// You are given 'n' roses and you are also given an array 'arr' where 'arr[i]' denotes that the 'ith' rose will bloom on the 'arr[i]th' day.

// You can only pick already bloomed roses that are adjacent to make a bouquet. You are also told that you require exactly 'k' adjacent bloomed roses to make a single bouquet.

// Find the minimum number of days required to make at least 'm' bouquets each containing 'k' roses. Return -1 if it is not possible.

// Example :
// Input: n = 9,  arr = [ 1, 2, 1, 2, 7, 2, 2, 3, 1 ], k = 3, m = 2

// Output: 3. 

// Explanation: This is because on the 3rd day: all the roses with 'arr[i]' less than equal to 3 have already bloomed, this means every rose except the 5th rose has bloomed. Now we can form the first bouquet from the first three roses and the second bouquet from the last three roses.

public class MinimumDays {

    public static int[] minMax(int arr[], int n) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }

        return new int[] { min, max };
    }

    public static boolean isFlower(int arr[], int flow, int bouq, int n, int days) {
        int counter = 0;
        int numberOfBouq = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= days) {
                counter++;
            } else {
                numberOfBouq += counter / flow;
                counter = 0;
            }
        }
        numberOfBouq += counter / flow;
        if (numberOfBouq > bouq)
            return true;
        return false;
    }

    public static int minDays(int arr[], int flow, int bouq, int n) {
        int arr2[] = minMax(arr, n);
        int s = arr2[0];
        int e = arr2[1];
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            System.out.println(mid);
            boolean check = isFlower(arr, flow, bouq, n, mid);
            System.out.println(check);
            if (check) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1 };
        int k = 1, m = 1;
        int ans = minDays(arr, k, m, arr.length);
        System.out.println(ans);
    }
}