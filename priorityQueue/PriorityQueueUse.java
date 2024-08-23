package priorityQueue;

public class PriorityQueueUse {
    public static void main(String[] args) throws PriorityQueueEmpty {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.insert("abc", 10);
        pq.insert("abd", 8);
        pq.insert("abde", 90);
        pq.insert("bde", 4);

        // while (!pq.isEmpty()) {
        // }
        pq.getList();
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        pq.getList();
    }
}
