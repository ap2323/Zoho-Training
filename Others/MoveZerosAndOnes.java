class MoveZerosAndOnes {

    public static void main(String[] args) {
        int[] array = {0, 1, 0, -1, 1, 0, 2, 1, 1, 1};
        moveZerosAndOnes(array);
        System.out.println("After Move: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void moveZerosAndOnes(int[] nums) {
        int zeroPointer = 0;
        int onePointer = nums.length - 1;
        int i = 0;

        while (i <= onePointer) {
            if (nums[i] == 0) {
                swap(nums, i, zeroPointer);
                zeroPointer++;
                i++;
            } else if (nums[i] == 1) {
                swap(nums, i, onePointer);
                onePointer--;
            } else {
                // For values other than 0 and 1, just move to the next element
                i++;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

