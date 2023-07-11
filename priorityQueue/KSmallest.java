package priorityQueue;

import java.util.PriorityQueue;

public class KSmallest {

    public static void kSmallest(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        for (int i = 0; i < k; i++) {
            System.out.println(pq.poll());
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 7, 5, 6, 9, 1, 2 };
        int k = 3;
        kSmallest(arr, k);
    }
}
