package priorityQueue;

public class Use {
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap();

        heap.insert(23);
        heap.insert(44);
        heap.insert(54);
        heap.insert(42);
        heap.insert(67);
        heap.insert(21);

        heap.printHeap();

        // while (!heap.isEmpty()) {
        // }
    }
}
