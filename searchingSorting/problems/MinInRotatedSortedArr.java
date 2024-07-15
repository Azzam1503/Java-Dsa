package searchingSorting.problems;

public class MinInRotatedSortedArr {

    public static int min(int arr[], int n) {
        int s = 0, e = n - 1;
        int min = Integer.MAX_VALUE;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[s] <= arr[mid]) {
                min = Math.min(min, arr[s]);
                s = mid + 1;
            } else {
                min = Math.min(arr[mid], min);
                e = mid - 1;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 1, 2, 3, 2, 1, 6, 9 };
        int n = arr.length;
        int ans = min(arr, n);
        System.out.println(ans);
    }
}
