package array.problems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static int majorityElementBetter(int arr[], int n) {
        int cnt = 0;
        int element = 0;
        int i = 0;
        while (i < n) {
            i++;
            if (cnt == 0) {
                element = arr[i];
            } else if (arr[i] == element) {
                cnt++;
            } else {
                cnt--;
            }
        }

        int count = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] == element)
                count++;
        }

        if (count > n / 2) {
            return element;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 4, 6, 7, 1, 1, 2, 1, 2 };
        System.out.println(majorityElement(arr, arr.length));
    }
}
