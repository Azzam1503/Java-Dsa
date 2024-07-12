package searchingSorting.problems;

public class FloorAndCeil {

    public static int[] flrAndCeil(int arr[], int n, int x) {
        int s = 0, e = n - 1;
        int ans[] = new int[2];
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] >= x) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        ans[1] = s;
        s = 0;
        e = n - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] <= x) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        ans[0] = e;
        return ans;
    }

    public static int[] flrAndCeilSingleIter(int arr[], int n, int x) {
        int floor = -1, ceil = -1;
        int s = 0, e = n - 1;
        int ans[] = new int[2];
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == x) {
                floor = arr[mid];
            } else if (arr[mid] >= x) {
                e = mid - 1;
                ceil = arr[mid];
            } else {
                s = mid + 1;
                floor = arr[mid];
            }
        }

        ans[0] = floor;
        ans[1] = ceil;
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 4, 7, 8, 10 };
        int n = 6, x = 2;
        int ans[] = flrAndCeil(arr, n, x);
        System.out.println(ans[0]);
        System.out.println(ans[1]);

    }
}
