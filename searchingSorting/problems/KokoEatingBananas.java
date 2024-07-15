package searchingSorting.problems;
// A monkey is given ‘n’ piles of bananas, where the 'ith' pile has ‘a[i]’ bananas. An integer ‘h’ is also given, which denotes the time (in hours) in which all the bananas should be eaten.

// Each hour, the monkey chooses a non-empty pile of bananas and eats ‘m’ bananas. If the pile contains less than ‘m’ bananas, then the monkey consumes all the bananas and won’t eat any more bananas in that hour.

// Find the minimum number of bananas ‘m’ to eat per hour so that the monkey can eat all the bananas within ‘h’ hours.

// Example:

// Input: ‘n’ = 4, ‘a’ =  [3, 6, 2, 8] , ‘h’ = 7

public class KokoEatingBananas {

    public static int max(int arr[], int n) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
        }

        return max;
    }

    public static int totHours(int arr[], int hours) {
        int totalHours = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            totalHours += Math.ceil((double) arr[i] / (double) hours);
        }

        return totalHours;
    }

    public static int koko(int arr[], int n, int h) {
        int max = max(arr, n);
        int s = 1;
        int e = max;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int hours = totHours(arr, mid);
            if (hours <= h) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return s;
    };

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 8 };
        int h = 7, n = 4;
        int ans = koko(arr, n, h);
        System.out.println(ans);
    }
}
