public class OrderAgnosticBS {
    public static void main(String[] args) {

//        int arr[] = { 2,5,7,9,11,34,56,78,90,123,567,890};
//        int target = 90;

        int arr[] = { 999, 875, 564, 99, 56, 34, 23, 11, 9, 3, 0, -1, -23, -34, -55};
        int target = 11;

        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
