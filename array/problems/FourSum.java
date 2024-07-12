package array.problems;

import java.util.*;

public class FourSum {

    // with target 0
    public static List<List<Integer>> fourSum(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (j > 1 && arr[j] == arr[j - 1])
                    continue;

                int k = j + 1;
                int l = n - 1;

                while (k < l) {
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum < 0) {
                        k++;
                    } else if (sum > 0) {
                        l--;
                    } else {
                        List<Integer> inner = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                        list.add(inner);

                        k++;
                        l--;

                        while (k < l && arr[k] == arr[k - 1]) {
                            k++;
                        }
                        ;
                        while (l > k && arr[l] == arr[l + 1]) {
                            l--;
                        }
                        ;
                    }
                }
            }
        }

        return list;

    }

    public static List<List<Integer>> fourSumWithTarget(int arr[], int target) {
        Arrays.sort(arr);
        int n = arr.length;

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (j != i + 1 && arr[j] == arr[j - 1])
                    continue;
                int k = j + 1;
                int l = n - 1;

                while (k < l) {
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum < target) {
                        k++;
                    } else if (sum > target) {
                        l--;
                    } else {
                        List<Integer> inner = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                        list.add(inner);

                        k++;
                        l--;

                        while (k < l && arr[k] == arr[k - 1]) {
                            k++;
                        }
                        ;
                        while (l > k && arr[l] == arr[l + 1]) {
                            l--;
                        }
                        ;
                    }
                }
            }
        }

        return list;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 2, 1, 3 };
        List<List<Integer>> list = fourSumWithTarget(arr, 8);
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (List<Integer> i : list) {
            System.out.println(i);
        }

    }
}
