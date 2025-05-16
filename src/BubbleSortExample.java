public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};
        System.out.println("Original Array:");
        printArray(arr);

        // Sort in Ascending Order
        bubbleSortAscending(arr);
        System.out.println("Sorted in Ascending Order:");
        printArray(arr);

        // Sort in Descending Order
        bubbleSortDescending(arr);
        System.out.println("Sorted in Descending Order:");
        printArray(arr);
    }
    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        //outer loop- iterate over the array
        //inner loop- to compare and swap adjacent elements
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
