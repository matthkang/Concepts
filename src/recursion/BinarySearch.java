package recursion;

public class BinarySearch {
    // return index of the target val
    // otherwise return -1;
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 8, 10, 15};
        int target = 15;

        int res = binarySearch(arr, target);
        System.out.println(res);
    }
}
