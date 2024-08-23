package priorityQueue;

import java.util.ArrayList;

public class MaxHeap {
    ArrayList<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    };

    public void insert(int elem) {
        heap.add(elem);
        int child = size() - 1;
        int parent = (child - 1) / 2;

        while (child > 0) {
            if (heap.get(child) > heap.get(parent)) {
                heap.set(child, heap.get(parent));
                heap.set(parent, elem);
                child = parent;
                parent = (child - 1) / 2;
            } else {
                break;
            }
        }

    }

    public int remove() {
        if (size() == 0)
            return -1;

        int ans = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int parentIndex = 0;
        int leftChild = (parentIndex * 2) + 1;
        int rightChild = (parentIndex * 2) + 2;
        while (leftChild < heap.size()) {
            int maxIndex = parentIndex;
            if (heap.get(leftChild) > heap.get(maxIndex)) {
                maxIndex = leftChild;
            }
            if (rightChild < heap.size() && heap.get(rightChild) > heap.get(maxIndex)) {
                maxIndex = rightChild;
            }

            if (parentIndex == maxIndex) {
                break;
            }

            int temp = heap.get(parentIndex);
            heap.set(parentIndex, heap.get(maxIndex));
            heap.set(maxIndex, temp);
            parentIndex = maxIndex;
            leftChild = (parentIndex * 2) + 1;
            rightChild = (parentIndex * 2) + 2;

        }
        return ans;
    }

    public void printHeap() {
        System.out.println(heap);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return heap.size();
    };

    public int getMax() {
        if (size() == 0)
            return -1;
        return heap.get(0);
    }

}
