public class Floor {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int arr[] = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(floor(arr, target));
    }

    //return index of greatest no. <= target

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //if there is no smaller than the target
        if(target < arr[start]){
            return -1;
        }

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
        return arr[end];
    }
}