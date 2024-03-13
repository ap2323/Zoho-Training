class RotationCount {

    public static void main(String[] args) {
        int[] array = {6, 7, 8, 9, 1, 2, 3, 4, 5};
        int rotationCount = findRotationCount(array);
        System.out.println("Rotation count: " + rotationCount);
    }

    public static int findRotationCount(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the next element
            if (mid < right && nums[mid] > nums[mid + 1]) {
                return mid + 1; // Rotation occurs after mid element
            }
            // If mid element is smaller than the previous element
            if (mid > left && nums[mid] < nums[mid - 1]) {
                return mid; // Rotation occurs at mid element
            }

            // If elements at mid, left, and right are same, then we can't decide which side to choose
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                // Skip duplicates
                if (nums[left] > nums[left + 1]) {
                    return left + 1;
                }
                left++;
                right--;
            } else if (nums[left] <= nums[mid]) {
                left = mid + 1; // Ignore left half
            } else {
                right = mid - 1; // Ignore right half
            }
        }

        return 0; // Array is not rotated
    }
}
