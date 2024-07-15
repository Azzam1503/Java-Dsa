package searchingSorting.problems;
// You are given an array of integers 'arr' and an integer 'limit'.

// Your task is to find the smallest positive integer divisor, such that upon dividing all the elements of the given array by it, the sum of the division's result is less than or equal to the given integer's limit.

// Note:
// Each result of the division is rounded to the nearest integer greater than or equal to that element. For Example, 7/3 = 3.

public class SmallestDivisor {

    public static int minMax(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }

    public static int divisonResult(int arr[], int n, int mid, int limit) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.ceil((double) arr[i] / (double) mid);
        }

        if (sum <= limit)
            return 1;
        return 0;
    }

    public static int smallestDivisor(int arr[], int n, int limit) {
        if (n > limit)
            return -1;
        int s = 1, e = minMax(arr, n);

        int ans = 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int sum = divisonResult(arr, n, mid, limit);
            if (sum == 1) {
                e = mid - 1;
                ans = mid;
            } else {
                s = mid + 1;
            }
        }
        // ans is either ans or s;
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 7, 11 };
        int n = arr.length;
        int limit = 11;
        int ans = smallestDivisor(arr, n, limit);
        System.out.println(ans);
    }
}
