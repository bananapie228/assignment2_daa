public class PerformanceTracker {

    public static long trackSortingTime(int[] arr) {
        long startTime = System.nanoTime();
        Main.insertion_sort(arr, arr.length);
        long endTime = System.nanoTime();
        return (endTime - startTime);
    }

    public static void runBenchmark() {
        int[] testSizes = {100, 1000};

        for (int size : testSizes) {
            int[] arr = generateRandomArray(size);
            System.out.println("Benchmarking for array size: " + size);
            long timeTaken = trackSortingTime(arr);
            System.out.println("Time taken for sorting: " + timeTaken + " nanoseconds\n");
        }
    }

    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        return arr;
    }
}
