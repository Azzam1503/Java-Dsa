package searchingSorting.problems;

public class UpperBound {

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

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 5 };
        int x = 2;
        int n = arr.length;

        System.out.println(upperBound(arr, n, x));
    }
}
