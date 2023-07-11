package priorityQueue;

import java.util.PriorityQueue;

public class KLargeset {

    public static void kLargest(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (pq.peek() < arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }

    public static void main(String[] args) {

        int arr[] = { 4, 7, 5, 6, 9, 1, 2 };
        int k = 3;
        kLargest(arr, k);
    }
}
