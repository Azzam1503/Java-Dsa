package searchingSorting.problems;

public class NoOfOccurence {

    public static int upperBound(int arr[], int n, int x) {
        int s = 0, e = n - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] > x) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

    public static int lowerBoud(int arr[], int n, int x) {
        int s = 0, e = n - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] >= x) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

    public static int noOfOccur(int arr[], int n, int x) {
        int lb = lowerBoud(arr, n, x);
        if (lb == n || lb == -1) {
            return 0;
        }
        int ub = upperBound(arr, n, x);

        return ub - 1 - lb + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 3, 3 };
        int x = 1, n = arr.length;
        int ans = noOfOccur(arr, n, x);
        System.out.println(ans);
    }
}
