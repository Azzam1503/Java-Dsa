package searchingSorting.problems;
// Problem statement

// You are the owner of a Shipment company. You use conveyor belts to ship packages from one port to another. The packages must be shipped within 'd' days.

// The weights of the packages are given in an array 'weights'. The packages are loaded on the conveyor belts every day in the same order as they appear in the array. The loaded weights must not exceed the maximum weight capacity of the ship.

// Find out the least-weight capacity so that you can ship all the packages within 'd' days.
// Sample Input 1:
// 8 5
// 5 4 5 2 3 4 5 6
// Sample Output 1:
// 9
// Explanation for Sample Input 1:
// In the test case, the given weights are [5,4,5,2,3,4,5,6] and these are needed to be shipped in 5 days. We can divide these weights in the following manner:
// Day         Weights            Total
// 1        -   5, 4          -    9
// 2        -   5, 2          -    7
// 3        -   3, 4          -    7
// 4        -   5             -    5
// 5        -   6             -    6
// The least weight capacity needed is 9, which is the total amount of weight that needs to be taken on Day 1.
public class CapacityToShipPackage {
    public static int[] getSum(int arr[], int n) {
        int sum = 0;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            min = Math.max(arr[i], min);
        }

        return new int[] { sum, min };
    }

    public static int divideWeightsInDays(int arr[], int n, int mid) {
        int timeline = 1;
        int capacity = mid;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= capacity) {
                capacity -= arr[i];
            } else {
                timeline++;
                capacity = mid - arr[i];
            }
        }

        return timeline;
    }

    public static int capacity(int arr[], int n, int days) {
        int[] sumAndMin = getSum(arr, n);
        if (n == 1) {
            return sumAndMin[1];
        }
        int s = sumAndMin[1], e = sumAndMin[0];
        int ans = -1;
        while (s <= e) {
            int mid = (s + e) / 2;
            int timeline = divideWeightsInDays(arr, n, mid);
            if (timeline > days) {
                s = mid + 1;
            } else {
                ans = s;
                e = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 86, 45, 74, 64, 14, 68, 44, 11, 43, 33, 8, 20 };
        int n = arr.length;
        int days = 12;
        int ans = capacity(arr, n, days);
        System.out.println(ans);
    }
}
