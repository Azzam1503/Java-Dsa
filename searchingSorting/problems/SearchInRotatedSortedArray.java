package searchingSorting.problems;

public class SearchInRotatedSortedArray {

    public static int search(int arr[], int n, int x) {
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[s] <= arr[mid]) {
                if (arr[s] <= x && x <= arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                if (arr[mid] <= x && x < arr[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }

        return -1;
    }

    public static int searchWithDuplicates(int arr[], int n, int x) {
        int s = 0, e = n - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[s] == arr[mid] && arr[mid] == arr[e]) {
                s = s + 1;
                e = e - 1;
            } else if (arr[s] <= arr[mid]) {
                if (arr[s] <= x && x <= arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                if (arr[mid] <= x && x <= arr[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 9, 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 3, 1, 2, 3, 3, 3, 3, 3 };
        int n = arr.length;
        int x = 1;
        int ans = searchWithDuplicates(arr2, arr2.length, x);
        System.out.println(ans);
    }
}
