import java.util.Arrays;

class ThreeSumUniqueTriplets {

    public static void main(String[] args) {
        int[] array = {-1, -2, 0, 5, -1, -4};
        int target = 2;
        int[][] triplets = threeSum(array, target);
        System.out.println("Unique triplets with sum equal to target:");
        for (int[] triplet : triplets) {
            System.out.println(Arrays.toString(triplet));
        }
    }

    public static int[][] threeSum(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0;
        int[][] result = new int[nums.length * nums.length * nums.length][3];

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            }

            for (int j = i + 1; j < nums.length - 1; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue; // Skip duplicates
                }

                for (int k = j + 1; k < nums.length; k++) {
                    if (k > j + 1 && nums[k] == nums[k - 1]) {
                        continue; // Skip duplicates
                    }

                    if (nums[i] + nums[j] + nums[k] == target) {
                        result[count++] = new int[]{nums[i], nums[j], nums[k]};
                        break;
                    }
                }
            }
        }

        return Arrays.copyOf(result, count);
    }
}
