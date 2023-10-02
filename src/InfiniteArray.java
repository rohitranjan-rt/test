public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 9, 11, 34, 56, 78, 90, 123, 567, 890, 911, 923, 945, 945, 956, 978};
        int target = 90;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int temp = end + 1;
             end = end + ( end - start + 1) * 2;
             start = temp;
        }
         return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

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
