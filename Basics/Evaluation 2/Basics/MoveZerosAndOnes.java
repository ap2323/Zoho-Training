class MoveZerosAndOnes {

    public static void main(String[] args) {
        int[] array = {0, 1, 0, -1, 1, 0, 0, 1, 1, 0};
        moveZerosAndOnes(array);
        System.out.println("After Move: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void moveZerosAndOnes(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // Move left pointer until it finds 1
            while (left <= right && nums[left] == 0) {
                left++;
            }
            // Move right pointer until it finds 0
            while (left <= right && nums[right] == 1) {
                right--;
            }
    
            if (left <= right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    }
}
