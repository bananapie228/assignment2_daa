public class InsertionSortTest {

    static void printArray(int[] arr, String testCaseName) {
        System.out.println(testCaseName + ": ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void testInsertionSort(int[] arr, String testCaseName) {
        printArray(arr, testCaseName);
        Main.insertion_sort(arr, arr.length);
    }

    public static void main(String[] args) {
        // Test 1: Random array
        int[] arr1 = {13, 46, 24, 52, 20, 9};
        testInsertionSort(arr1, "Test 1: Random Array");

        // Test 2: Already sorted array
        int[] arr2 = {1, 2, 3, 4, 5};
        testInsertionSort(arr2, "Test 2: Already Sorted Array");

        // Test 3: Reverse sorted array
        int[] arr3 = {5, 4, 3, 2, 1};
        testInsertionSort(arr3, "Test 3: Reverse Sorted Array");

        // Test 4: Single element array
        int[] arr4 = {1};
        testInsertionSort(arr4, "Test 4: Single Element Array");

        // Test 5: Empty array
        int[] arr5 = {};
        testInsertionSort(arr5, "Test 5: Empty Array");

        // Test 6: Array with duplicates
        int[] arr6 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        testInsertionSort(arr6, "Test 6: Array with Duplicates");
    }
}
