package searchingSorting.problems;

public class LowerBound {
    public static int lowerBoud(int arr[], int n, int x) {
        if (x > arr[n - 1])
            return n;
        if (x < arr[0])
            return 0;

        int lowBound = -1;
        int s = 0, e = n - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] >= x) {
                lowBound = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return lowBound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 5 };
        int x = 2;
        int n = arr.length;
        int ans = lowerBoud(arr, n, x);
        System.out.println(ans);
    }
}
