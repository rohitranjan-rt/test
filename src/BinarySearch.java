public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int arr[] = { 2,5,7,9,11,34,56,78,90,123,567,890};
        int target = 90;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}