class NonDecreasingArray {

    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
                if (count > 1) {
                    return false;
                }
                
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 5, 7};
        int[] nums2 = {10, 20, 1};

        System.out.println(checkPossibility(nums1)); 
        System.out.println(checkPossibility(nums2));
    }
}

