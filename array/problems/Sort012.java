package array.problems;

public class Sort012 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 0, 0, 1, 2, 2, 0, 1, 0, 0, 0 };
        int n = arr.length;
        sort012(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void sort012(int[] arr, int n) {
        int nextZero = 0;
        int nextTwo = n - 1;
        int i = 0;

        while (i <= nextTwo) {
            if (arr[i] == 0) {
                arr[i] = arr[nextZero];
                arr[nextZero] = 0;
                nextZero++;
            } else if (arr[i] == 2) {
                arr[i] = arr[nextTwo];
                arr[nextTwo] = 2;
                nextTwo--;
            } else {
                i++;
            }
        }
    }
}
