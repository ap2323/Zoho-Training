import java.util.Arrays;

class CheckNumberInList {

    public static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return true; // Found the target
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return false; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 11;

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Target: " + target);
        boolean found = binarySearch(arr, target);
        System.out.println("Is the target in the array? " + found);
    }
}
