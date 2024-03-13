class ArraySortedRotatedArrayPairSum {

    public static void main(String[] args) {
        int[] array = {6, 7, 8, 9, 1, 2, 3, 4, 5};
        int sum = 10;
        System.out.println("Pair with sum " + sum + " exists: " + pairWithSumExists(array, sum));
    }

    public static boolean pairWithSumExists(int[] nums, int target) {
        int pivot = findPivot(nums); // Find the pivot element where rotation occurs
        int n = nums.length;

        int left = pivot;
        int right = (pivot - 1 + n) % n; // Adjusting for negative values

        while (left != right) {
            int currentSum = nums[left] + nums[right];
            if (currentSum == target) {
                return true;
            } else if (currentSum < target) {
                left = (left + 1) % n;
            } else {
                right = (right - 1 + n) % n;
            }
        }

        return false;
    }

    private static int findPivot(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid < right && nums[mid] > nums[mid + 1]) {
                return mid + 1;
            } else if (mid > left && nums[mid] < nums[mid - 1]) {
                return mid;
            } else if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return 0; // If no rotation occurs
    }
}
