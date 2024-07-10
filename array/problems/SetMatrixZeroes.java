package array.problems;

import java.util.ArrayList;

public class SetMatrixZeroes {

    public static void setMatrixZero(int arr[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    for (int k = 0; k < n; k++) {
                        arr[i][k] = -1;
                        arr[k][j] = -1;
                    }
                }
            }
        }
        ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
        ;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 1, 1, 1 }, { 1, 0, 0, 1 }, { 1, 1, 0, 1 }, { 1, 1, 1, 1 } };
        int n = arr.length;
        setMatrixZero(arr, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
