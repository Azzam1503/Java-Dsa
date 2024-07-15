package searchingSorting.problems;

public class PeakElement {

    public static int peakElem(int arr[], int n) {
        if (n == 1)
            return arr[0];

        if (arr[0] > arr[1])
            return arr[0];

        if (arr[n - 1] > arr[n - 2])
            return arr[n - 1];

        int peak = -1;
        int s = 1, e = n - 2;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1])
                return arr[mid];
            if (arr[s] <= arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }

        }

        return peak;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 12, 3, 4, 5, 6, 7, 8, 5, 5 };
        int n = arr.length;
        int peak = peakElem(arr, n);
        System.out.println(peak);
    }
}
