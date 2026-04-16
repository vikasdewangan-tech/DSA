class QuickSortExample {

    // Partition Function
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // last element pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Quick Sort Function
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            // left part
            quickSort(arr, low, pi - 1);

            // right part
            quickSort(arr, pi + 1, high);
        }
    }

    // Print Function
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 4, 2};

        quickSort(arr, 0, arr.length - 1);

        System.out.print("Sorted array: ");
        printArray(arr);
    }
}