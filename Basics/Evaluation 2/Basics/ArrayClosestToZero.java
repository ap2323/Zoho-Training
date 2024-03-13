import java.util.Arrays;

class ArrayClosestToZero {

    public static void main(String[] args) {
        int[] array = {-4, -2, 1, 5, 6}; 
        int[] closestPair = findClosestToZero(array);
        System.out.println("Closest pair to zero: " + Arrays.toString(closestPair));
    }

    public static int[] findClosestToZero(int[] nums) {
        SortingArrayAndString.sortingNumeric(nums); 

        int left = 0;
        int right = nums.length - 1;
        int minSum = Integer.MAX_VALUE;
        int[] closestPair = new int[2];

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                closestPair[0] = nums[left];
                closestPair[1] = nums[right];
            }
            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                break;
            }
        }

        return closestPair;
    }
}
