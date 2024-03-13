class ArrayMajorityElement {

    public static void main(String[] args) {
        int[] array = {3, 3, 2, 4, 4, 4, 2, 4, 4}; 
        int majorityElement = findMajorityElement(array);
        System.out.println("Majority element: " + majorityElement);
    }

    public static int findMajorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0]; 

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
		
        return count > nums.length / 2 ? candidate : -1; 
    }
}
