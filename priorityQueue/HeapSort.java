package priorityQueue;

public class HeapSort {
    public static void heapSort(int arr[], int i) {
        int temp = arr[i];
        arr[i] = arr[0];
        arr[0] = temp;

        int parentIndex = 0;
        int leftChild = (parentIndex * 2) + 1;
        int rightChild = (parentIndex * 2) + 2;

        while (leftChild < i) {
            int maxIndex = parentIndex;

            if (arr[leftChild] > arr[maxIndex]) {
                maxIndex = leftChild;
            }

            if (rightChild < i && arr[rightChild] > arr[maxIndex]) {
                maxIndex = rightChild;
            }

            if (maxIndex == parentIndex)
                break;

            temp = arr[parentIndex];
            arr[parentIndex] = arr[maxIndex];
            arr[maxIndex] = temp;
            parentIndex = maxIndex;
            leftChild = (parentIndex * 2) + 1;
            rightChild = (parentIndex * 2) + 2;

        }

    }

    public static void heapify(int[] arr, int i) {
        int child = i;
        int parent = (child - 1) / 2;

        while (child > 0) {
            if (arr[child] > arr[parent]) {
                int temp = arr[child];
                arr[child] = arr[parent];
                arr[parent] = temp;

                child = parent;
                parent = (child - 1) / 2;
            } else {
                break;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 12, 3, 2, 15, 7 };
        for (int i = 0; i < arr.length; i++) {
            heapify(arr, i);
        }
        ;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            heapSort(arr, i);
        }
        ;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(5 / 2);
    }
}

// 15 12 2 3 7
// 12 15 2 3 7
// 15 12 2 .3 7
// 15 12 .7 .3 2
// 15 .12 .7 .3 2
// 12 7 2 3 .15
// 3 7 2 .12 15

// 7 3 2 .12 .15
// 2 3 .7 .12 .15
// 2 .3 .7 .12 .15
