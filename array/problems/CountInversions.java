package array.problems;

public class CountInversions {
    public static int merge(int arr[], int low, int mid, int high) {
        int ans[] = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        int count = 0;
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                ans[k] = arr[i];
                k++;
                i++;
            } else {
                ans[k] = arr[j];
                k++;
                j++;
                count += (mid - i + 1);
            }
        }

        while (i <= mid) {
            ans[k] = arr[i];
            i++;
            k++;
        }

        while (j <= high) {
            ans[k] = arr[j];
            j++;
            k++;
        }
        k = 0;
        for (int l = low; l <= high; l++) {
            arr[l] = ans[k++];
        }
        return count;
    };

    public static int mergeSort(int arr[], int low, int high) {
        int count = 0;
        if (low >= high)
            return 0;
        int mid = (low + high) / 2;

        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 1, 4 };
        int ans = mergeSort(arr, 0, arr.length - 1);
        System.out.println(ans);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
