class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {

        int index = 0;
        for(int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[index]) {
                nums[index + 1] = nums[j];
                index++;
            }
        }
        
        return index + 1;
    }
    
    public static void main(String[] args) {
	System.out.println(removeDuplicates(new int[]{1,1,2,3,4,4}));
}
}
