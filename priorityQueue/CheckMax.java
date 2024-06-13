package priorityQueue;

public class CheckMax {
    public static boolean check(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < 2 * i + 1; i++) {
            int leftChild = 2 * i + 1;
            int rightChild = leftChild + 1;

            if (arr[i] < arr[leftChild]) {
                return false;
            }

            if (rightChild < n && arr[i] < arr[rightChild]) {
                return false;
            }
        }
        return true;
    }
}
