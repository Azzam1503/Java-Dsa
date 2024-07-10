package array.problems;

public class RotataMatixBy90 {
    public static int[][] rotataMatixBy90(int arr[][], int n, int m) {
        int ans[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[j][n - i - 1] = arr[i][j];
            }
        }
        return ans;
    };

    public static void reverseArr(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < n / 2) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotataMatixBy90Better(int arr[][], int n, int m) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            reverseArr(arr[i]);
        }
    };

    public static void printArr(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    };

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        printArr(arr);
        rotataMatixBy90Better(arr, arr.length, arr[0].length);
        printArr(arr);
        int arr2[] = { 1, 2, 3, 4, 5 };
    }
}
